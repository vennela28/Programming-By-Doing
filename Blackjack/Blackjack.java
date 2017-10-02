import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int player_card1, player_card2;
		int dealer_card1, dealer_card2;
		int new_card;
		int player_total, dealer_total;
		int wallet = 500, wager;
		String replay;
		String choice;
		
		System.out.println( "Welcome to Nick's blackjack program!" );
		
		do
		{
			// betting loop. player can bet a maximum of 100 
			System.out.println( "\n***********************************************" );
			System.out.println( "Now taking bets for the next hand of blackjack." );
			System.out.println( "You currently have $" + wallet + "." );
			System.out.println( "***********************************************" );
			do
			{
				System.out.println( "How much do you put down (Min: $5 Max: $100, increments of 5)? " );
				System.out.print( "> $" );
				wager = keyboard.nextInt();
				if ( wager < 1 || wager > 100 || wager > wallet || wager % 5 != 0)
					System.out.println( "You cannot bet $" + wager + ". Please try again." );
			} while ( wager < 1 || wager > 100 || wager > wallet || wager % 5 != 0);
			
			
			player_card1 = 2 + r.nextInt(10);
			player_card2 = 2 + r.nextInt(10);
			player_total = player_card1 + player_card2;
			dealer_card1 = 2 + r.nextInt(10);
			dealer_card2 = 2 + r.nextInt(10);
			dealer_total = dealer_card1 + dealer_card2;
			
			
			// Display initial dealing
			System.out.println( "\nYou get a " + player_card1 + " and a " + player_card2 + "." );
			System.out.println( "Your total is " + player_total + ".\n" );
			System.out.println( "The dealer has a " + dealer_card1 + " showing, and a hidden card." );
			System.out.println( "His total is hidden, too.\n" );
			
			// Player's turn
			do
			{
				System.out.print( "Would you like to \"hit\" or \"stay\"? " );
				choice = keyboard.next();
				
				if ( choice.equals("hit") )
				{
					new_card = 2 + r.nextInt(10);
					System.out.println( "You drew a " + new_card + "." );
					player_total += new_card;
					System.out.println( "Your total is " + player_total + ".\n" );
				}
			} while ( player_total <= 21 && (! choice.equals("stay") ) );
			
			// Dealer's turn does not play if Player busts
			if ( player_total <= 21 )
			{
				System.out.println( "\n******************" );
				System.out.println( "Okay, dealer's turn." );
				System.out.println( "His hidden card was a " + dealer_card2 + "." );
				System.out.println( "His total was " + dealer_total + ".\n" );
				
				do
				{
					// Dealer will hit until it has 17 or greater
					if ( dealer_total < 17 )
					{
						choice = "hit";
						System.out.println( "Dealer chooses to hit." );
						new_card = 2 + r.nextInt(10);
						System.out.println( "He draws a " + new_card + "." );
						dealer_total += new_card;
						System.out.println( "His total is " + dealer_total + ".\n" );
					}
					else
					{
						choice = "stay";
						System.out.println( "Dealer stays.\n" );
					}
				} while ( dealer_total <= 21 && (! choice.equals("stay") ) );
				
			}
			
			System.out.println( "Dealer's total is " + dealer_total + "." );
			System.out.println( "Your total is " + player_total + ".\n" );
			
			// Determines who wins
			
			if ( player_total <= 21 )
			{
				if ( dealer_total <= 21 )
				{
					if (player_total > dealer_total )
					{
						System.out.println( "YOU WIN!" );
						wallet += wager;
					}
					else if ( player_total == dealer_total )
					{
						System.out.println( "You Drew." );
					}
					else
					{
						System.out.println( "you lose" );
						wallet -= wager;
					}
				}
				else
				{
					System.out.println( "YOU WIN!" );
					wallet += wager;
				}
			}
			else
			{
				System.out.println( "you lose" );
				wallet -= wager;
			}
			
			// checks if user can play then if they want to continue
			if ( wallet <= 0 )
			{
				System.out.println( "\nYou've run out of money. Better luck next time!" );
				break;
			}
			
			System.out.println( "\nYou now have $" + wallet );
			System.out.print( "Care to play again (y/n)? " );
			replay = keyboard.next();
			
		} while (! replay.equals("n") );
	}
}