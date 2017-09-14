import java.util.*;
import java.io.*;
public class LittlePuzzle{
	public static void main(String[] args) throws Exception{
		//Input the filename you want to change
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		
		//Input the filename
		String file = keyboard.nextLine();
		System.out.println();
		
		//File to be read that is input in the above line
		File in = new File(file);
		Scanner input = new Scanner(in);
		
		// Display the string from the file after running from the loop
		String jumbledtxt=input.nextLine();
		input.close();
		
		//Change the text from the mentioned filename
		for(int i=0; i<jumbledtxt.length(); i++){
			if ( (i+1) % 3 == 0 )
				System.out.print( jumbledtxt.charAt(i) );
		}
		System.out.println();
	}
}