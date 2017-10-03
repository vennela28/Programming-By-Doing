import java.util.*;
import java.io.*;
class Car{
	String make;
	String model;
	int year;
	String license_plate;
}
public class StoringDataInAFile{
	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		Car[] car_details = new Car[5];
		
		for(int i=0; i<car_details.length; i++){
			
			car_details[i] = new Car();
			System.out.println("\nCar "+(i+1));
			
			System.out.print("\t Make: ");
			car_details[i].make = keyboard.next();
			
			System.out.print("\t Model: ");
			car_details[i].model = keyboard.next();
			
			System.out.print("\t Year: ");
			car_details[i].year = keyboard.nextInt();
			
			System.out.print("\t License: ");
			car_details[i].license_plate = keyboard.next();
		}
		System.out.println();
		System.out.print("\nTo which file do you want to save this information? ");
		String file_name = keyboard.next();
		File in = new File(file_name);
		FileWriter fw = new FileWriter(in);
		PrintWriter pw = new PrintWriter(fw);
		for(int j=0; j<car_details.length; j++){
			pw.print(car_details[j].make);
			pw.print("\t"+car_details[j].model);
			pw.print("\t"+car_details[j].year);
			pw.print("\t"+car_details[j].license_plate);
			pw.println();
		}
		pw.close();
		System.out.println();
		System.out.println("Data saved.");
		
	}
}