import java.util.*;
import java.io.*;
public class ParallelArrays{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String a1[]={"Mitchell","Ortiz","Luu","Zimmerman","Brooks"};
		double a2[]={99.5, 78.5, 95.6 ,96.8 ,82.7 };
		int a3[]={123456,813225,823669,307760,827131};
		boolean found= false;
		int slot=0;
		String name="";
		double average=0.00;
		int id = 0;
		System.out.println("Values:");
		
		for(int i=0; i<a3.length; i++){
			System.out.println("\t\t"+a1[i]+" "+a2[i]+" "+a3[i]);
		}
		
		System.out.print("\nID number to find: ");
		int value = keyboard.nextInt();
		System.out.println();
		for(int j=0; j<a3.length; j++){
			if(a3[j]==value && !found){
				slot = j;
				name = a1[j];
				average = a2[j];
				id = a3[j];
				found=true;
			}
		}
		System.out.print("Found in the slot " +slot);
		System.out.println();
		System.out.println("\t Name: " +name);
		System.out.println("\t Average: "+average);
		System.out.println("\t ID: "+id);
		
	}
}