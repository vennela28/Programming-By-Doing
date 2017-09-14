import java.util.*;
import java.io.*;

public class VowelCapitalization{
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		String file = keyboard.next();
		System.out.println();
		
		File in = new File(file);
		Scanner input = new Scanner(in);
		
		while ( input.hasNext() )
		{
			String line = input.nextLine();
			
			for ( int i = 0; i < line.length(); i++ )
			{
				char c = line.charAt(i);
				
				if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
				{
					System.out.print( Character.toUpperCase(c) );
				}
				else
					System.out.print( c );
			}	
			System.out.println();
		}
	}
}