import java.util.Scanner;
public class MoreUserInputOfData{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("");
		System.out.print("First name: ");
		String fname = keyboard.next();
		System.out.print("Last name: ");
		String lname = keyboard.next();
		System.out.print("Grade(9-12): ");
		int grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		int id = keyboard.nextInt();
		System.out.print("Login: ");
		String login = keyboard.next();
		System.out.print("GPA (0.0-4.0): ");
		double gpa = keyboard.nextDouble();
		System.out.println("");
		System.out.println("Your information:");
		System.out.println("\t\tLogin: "+login);
		System.out.println("\t\tID:    "+id);
		System.out.println("\t\tName:  "+lname+", "+fname);
		System.out.println("\t\tGPA:   "+gpa);
		System.out.println("\t\tGrade: "+grade);
	}
}