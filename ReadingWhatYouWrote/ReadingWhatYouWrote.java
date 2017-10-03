import java.util.*;
import java.io.*;
class Car{
	String make;
	String model;
	int year;
	String license_plate;
}
public class ReadingWhatYouWrote{
	public static void main(String args[]) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		Car cars[] = new Car[5];
		int i = 0;
		System.out.print("From which file do you want to load this information? ");
		String file_name = keyboard.next();
		File in = new File(file_name);
		Scanner readFile = new Scanner(in);
		while(readFile.hasNext()){
			cars[i] = new Car();
			cars[i].make = readFile.next();
			cars[i].model = readFile.next();
			cars[i].year = readFile.nextInt();
			cars[i].license_plate = readFile.next();
			i++;
		}
		readFile.close();
		System.out.println("Data loaded.");
		System.out.println();
		for(int j = 0; j<cars.length; j++){
			System.out.println("\nCar "+(j+1));
			System.out.println("\t Make: "+cars[j].make);
			System.out.println("\t Model: "+cars[j].model);
			System.out.println("\t Year: "+cars[j].year);
			System.out.println("\t License: "+cars[j].license_plate);
		}
	}
}