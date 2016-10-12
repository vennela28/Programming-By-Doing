import java.util.Scanner;
class Student
{
	String name;
	int grade;
	double avg;
}
public class LilDatabase{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Student s_one = new Student();
		Student s_two = new Student();
		Student s_three = new Student();
		System.out.print("Enter the first student's name: ");
		 s_one.name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		 s_one.grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		 s_one.avg = keyboard.nextDouble();
		System.out.println();
		System.out.print("Enter the second student's name: ");
		 s_two.name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		 s_two.grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		 s_two.avg = keyboard.nextDouble();
		System.out.println();
		System.out.print("Enter the third student's name: ");
		s_three.name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		s_three.grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		s_three.avg = keyboard.nextDouble();
		System.out.println();
	
		System.out.println("The names are: "+s_one.name+" "+s_two.name+" "+s_three.name);
		System.out.println("The grades are: "+s_one.grade+" "+s_two.grade+" "+s_three.grade);
		System.out.println("The averages are: "+s_one.avg+" "+s_two.avg+" "+s_three.avg);
		System.out.println();
		
	}
}