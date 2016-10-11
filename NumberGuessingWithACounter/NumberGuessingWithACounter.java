import java.util.*;
public class NumberGuessingWithACounter{
	public static void main(String[] args){
	Scanner keybaord = new Scanner(System.in);
	Random r = new Random();
	
	int Low = 1;
	int High = 10;
	int actual = r.nextInt(High-Low) + Low;
	System.out.println(actual);
	
	System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
	int tries=1;
	System.out.print("Your guess: ");
	int guess = keybaord.nextInt();
	while(guess!=actual){
		if(guess!=actual){
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keybaord.nextInt();
			tries++;
		}
	}
			System.out.println("That's right!  You're a good guesser.");
			System.out.println("It took you "+tries+" tries.");		
	}
}