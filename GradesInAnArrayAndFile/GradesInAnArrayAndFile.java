import java.io.*;
import java.util.*;
public class GradesInAnArrayAndFile{
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int a[] = new int[5]; 
		
		System.out.print("Name (first last): ");
		String fname = keyboard.next();
		String lname = keyboard.next();
		
		System.out.print("Filename: ");
		String file_name = keyboard.next();
		
		FileWriter fw = new FileWriter(file_name);
		fw.write(fname+" "+lname);
		fw.write("\n");
		System.out.println();
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		
		for(int i=0; i<a.length; i++){
			a[i]=50+r.nextInt(90);
			fw.write(a[i] +"  ");
			System.out.println("Grade "+(i+1)+" : "+a[i]);
		}
		fw.close();
		System.out.println();
		System.out.println("Data saved in \""+file_name+"\".");
	}
}