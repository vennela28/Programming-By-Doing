import java.util.Scanner;
public class WorstGuessing{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("TEH WORST NUBMER GUESSING GAME EVAR!!!!!!!1!");
		System.out.println();
		int guess = 4;
		System.out.print("I\'M THKING OF A NBR FROM 1-10.  TRY 2 GUESS! ");
		int choice = keyboard.nextInt();
		System.out.println();
		if(choice==guess){
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+guess+"!");
		}else{
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+guess+"!");
		}
	}
}