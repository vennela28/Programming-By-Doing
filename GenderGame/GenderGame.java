import java.util.Scanner;
public class GenderGame{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your gender (M or F): ");
	String gender = keyboard.next();
	System.out.print("First Name: ");
	String fname = keyboard.next();
	System.out.print("Last Name: ");
	String lname = keyboard.next();
	System.out.print("Age: ");
	int age = keyboard.nextInt();
	System.out.println();
	String name=fname+" "+lname;
	String marry="";
	if(age>=20 && gender.equals("F")){
		System.out.print("Are you married, "+fname+" (y or n)? ");
		marry = keyboard.next();
		if(marry.equals("y")){
			System.out.println("Then I shall call you Mrs. "+lname);
		}else{
			System.out.println("Then I shall call you Ms. "+lname);
		}
	}
	
	if(age>=20 && gender.equals("M") ){
		System.out.println("Then I shall call you Mr. "+lname);
	}
	
	if(age<20){
		System.out.println("Then I shall call you "+name);
	}
	
	}
	
}