import java.util.*;
import java.io.*;
public class HowManyTimes{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int a[] = new int[10];
		int times=0;
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++){
			a[i]=1+r.nextInt(50);
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.print("Value to find: ");
		int value = keyboard.nextInt();
		System.out.println();
		for(int j=0; j<a.length; j++){
			if (value==a[j]){
				times++;
			}
		}		
			System.out.println(value+" was found "+ times +" times.");
			
		}
}