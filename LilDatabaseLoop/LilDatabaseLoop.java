import java.util.Scanner;
class Student
{
	String name;
	int grade;
	double avg;
}
public class LilDatabaseLoop{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Student s_db[] = new Student[3];
		
		for(int i=0; i<s_db.length; i++){
			
			s_db[i]=new Student();
			System.out.print("Enter student " +(i+1)+"'s name: ");
			s_db[i].name = keyboard.next();
			System.out.print("Enter student "+(i+1)+"'s grade: ");
			s_db[i].grade = keyboard.nextInt();
			System.out.print("Enter student "+(i+1)+"'s average: ");
			s_db[i].avg = keyboard.nextDouble();
			System.out.println();
					
		}
		System.out.println("The names are: "+s_db[0].name+" "+s_db[1].name+" "+s_db[2].name);
		System.out.println("The grades are: "+s_db[0].grade+" "+s_db[1].grade+" "+s_db[2].grade);
		System.out.println("The averages are: "+s_db[0].avg+" "+s_db[1].avg+" "+s_db[2].avg);
		System.out.println();
		
	
		
		
	}
}