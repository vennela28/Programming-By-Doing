import java.util.*;
import java.io.*;
public class DisplayingAFile{
	public static void main(String[] args) throws Exception{
	Scanner keyboard = new Scanner(System.in);
	System.out.print( "Which file would you like to read numbers from: " );
		
	String usrFile = keyboard.next();
		
	File in = new File(usrFile);
	Scanner input = new Scanner(in);
		
		while ( input.hasNext() )
		{
		    System.out.println( input.nextLine() );
		}
	
	}
}