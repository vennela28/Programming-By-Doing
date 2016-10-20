import java.util.*;
import java.io.*;
public class SummingSeveralNumbersFromAnyFile{
	public static void main(String args[]) throws Exception{
		Scanner keyboard = new Scanner(System.in);
	    String usrFile;
		System.out.print( "Which file would you like to read numbers from: " );
		usrFile = keyboard.next();
		File in = new File(usrFile);
		Scanner input = new Scanner(in);
		System.out.println( "Reading numbers from file \"" + usrFile + "\"\n" );
		int total = 0;
		while ( input.hasNext() )
		{
		    int num = input.nextInt();
		    System.out.print( num + " " );
		    total += num;		
		}
		System.out.println( "\nTotal is " + total);
	}
}