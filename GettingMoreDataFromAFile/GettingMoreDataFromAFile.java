import java.util.*;
import java.io.*;
class Person
{
	String name;
	int age;
}
public class GettingMoreDataFromAFile{
	public static void main(String args[]) throws Exception{
		Scanner kb = new Scanner(System.in);
		Person[] fame_db = new Person[5];
		String choice;
		int i = 0;
		
		System.out.print( "Which file to open: " );
		choice = kb.next();
	
		File usrFile = new File(choice);
		Scanner readFile = new Scanner(usrFile);
	
		System.out.println( "Reading data from " + choice + "\n" );
	
		while ( readFile.hasNext() )
		{
			fame_db[i] = new Person();
			fame_db[i].name = readFile.next();
			fame_db[i].age = readFile.nextInt();
			i++;
		}
		readFile.close();
	
		for ( i = 0; i < fame_db.length; i++ ){
			System.out.println( fame_db[i].name + " is " + fame_db[i].age );
		}
		
	}
}