import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String heightFt, heightIn;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		heightFt = keyboard.next();
		
		System.out.print( "How many inches? " );
		heightIn = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + heightFt +"'" + heightIn +"\""+ " tall and " + weight + " lbs. heavy." );
	}
}