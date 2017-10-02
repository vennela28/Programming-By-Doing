import java.util.Scanner;
import java.io.File;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{
		
		Scanner fileIn = new Scanner(new File("name.txt"));
		String f_name =fileIn.next();
		String l_name =fileIn.next();
		
		
		System.out.println( "Using my psychic powers aided by reading data from the file, I have" );
		System.out.println( "determined that your name is " +f_name+" "+l_name+"." );
		System.out.println( "Amazing, huh?" );
	}
}