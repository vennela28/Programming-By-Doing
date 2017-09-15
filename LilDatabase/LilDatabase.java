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
		Student s_db[] = new Student[3];
		
		s_db[0]=new Student();
		System.out.print("Enter the first student's name: ");
		 s_db[0].name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		 s_db[0].grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		 s_db[0].avg = keyboard.nextDouble();
		System.out.println();
		
		s_db[1]=new Student();
		System.out.print("Enter the second student's name: ");
		 s_db[1].name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		 s_db[1].grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		 s_db[1].avg = keyboard.nextDouble();
		System.out.println();
		
		s_db[2]=new Student();
		System.out.print("Enter the third student's name: ");
		s_db[2].name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		s_db[2].grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		s_db[2].avg = keyboard.nextDouble();
		System.out.println();
	
		System.out.println("The names are: "+s_db[0].name+" "+s_db[1].name+" "+s_db[2].name);
		System.out.println("The grades are: "+s_db[0].grade+" "+s_db[1].grade+" "+s_db[2].grade);
		System.out.println("The averages are: "+s_db[0].avg+" "+s_db[1].avg+" "+s_db[2].avg);
		System.out.println();
		
	}
}