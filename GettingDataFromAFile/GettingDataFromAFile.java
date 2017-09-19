import java.util.*;
import java.io.*;
class Dog{
	String breed;
	int age;
	double weight;
}
public class GettingDataFromAFile{
	public static void main(String[] args) throws Exception{
			
			Dog[] dog_db = new Dog[2];
			String value;
			int i=0;
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Which file to open: ");
			value=keyboard.next();
			
			FileReader file = new FileReader(value);
			Scanner readFile = new Scanner(file);
			
			System.out.println("Reading data from "+value);
			System.out.println();
			
			while(readFile.hasNext()){
				dog_db[i]=new Dog();
				String line = readFile.nextLine();
				String[] dog_details=line.split(",");
				
				dog_db[i].breed=dog_details[0];
				dog_db[i].age=Integer.parseInt(dog_details[1]);
				dog_db[i].weight=Double.parseDouble(dog_details[2]);
				i++;
			}
			readFile.close();
			
		System.out.println( "First dog: " + dog_db[0].breed + ", " + dog_db[0].age + ", " + dog_db[0].weight );
		System.out.println( "Second dog: " + dog_db[1].breed + ", " + dog_db[1].age + ", " + dog_db[1].weight );
		
	}
}