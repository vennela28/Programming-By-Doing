import java.util.*;
public class NumberGuess{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	int x=1+r.nextInt(10);
	System.out.print("I'm thinking of a number from 1 to 10.");
	System.out.println();
	System.out.print("Your guess: ");
	int guess = keyboard.nextInt();
	System.out.println();
	if(guess==x){
		System.out.print("That's right!  My secret number was "+x+"!");
	}else{
		System.out.println("Sorry, but I was really thinking of "+x+".");
	}
  }
}