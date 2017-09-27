import java.util.Scanner;
public class LittleQuiz{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int correct=0;
	System.out.print("Are, you ready for a quiz? ");
	String ans = keyboard.next();
	if(ans.equals("Y")){
			System.out.println("Okay, here it comes! ");
			System.out.println();
	System.out.println("Q1) What is the capital of Alaska?");
	System.out.println( "\t\t 1) Melbourne");
	System.out.println("\t\t 2) Anchorage");
	System.out.println("\t\t 3) Juneau");
	System.out.println();
	int choice = keyboard.nextInt();
	if(choice==3){		
		System.out.println();
		System.out.println("That\'s right!");
		correct++;
	}else{
		System.out.println();
		System.out.println("Sorry, Juneau is the capital of Alaska.");
	}
	System.out.println();
	System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
	System.out.println( "\t\t 1) Yes");
	System.out.println("\t\t 2) No");
	System.out.println();
	int choice1 = keyboard.nextInt();
	if(choice1==1){	
		System.out.println();
		System.out.println("Sorry, \"cat\" is a String , ints can only be numbers.");
	}else{
		System.out.println();		
		System.out.println("That\'s right!");
		correct++;
	}
	System.out.println();
	System.out.println("Q3) What is the result of 9+6/3? ");
	System.out.println( "\t\t 1) 5");
	System.out.println("\t\t 2) 11");
	System.out.println("\t\t 3) 15/3");
	System.out.println();
	int choice2=keyboard.nextInt();
	if(choice2==2){
		System.out.println();
		System.out.println("That\'s right!");
		correct++;
	}else{
		System.out.println();
		System.out.println("Sorry, 11 is the correct answer.");
	}
	System.out.println();
	if(correct==3){
		System.out.println("Overall you got all 3 correct.");
	}else{
		System.out.println("Overall you got "+correct+" out of 3 correct.");
	}
	
	}
	System.out.println("Thanks for playing!");
}
}