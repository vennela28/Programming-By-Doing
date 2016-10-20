import java.util.Scanner;
import java.io.*;

public class SummingThreeNumbersFromAnyFile{
	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;
		String usrFile;
		
		System.out.print( "Which file would you like to read numbers from: " );
		usrFile = keyboard.next();
		
		File in = new File(usrFile);
		Scanner input = new Scanner(in);
		
		System.out.println( "Reading numbers from file \"" + usrFile + "\"\n" );
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.close();

		System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
	}
	
}