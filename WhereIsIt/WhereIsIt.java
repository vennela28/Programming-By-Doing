import java.io.*;
import java.util.*;
public class WhereIsIt{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int a[] = new int[10];
		int slot=0;
		boolean found=false;
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++){
			a[i]=1+r.nextInt(50);
			System.out.print(a[i]+"  ");
		}
		System.out.print("\nValue to find: ");
		int value = keyboard.nextInt();
		for(int j=0; j<a.length; j++){
			if(a[j]==value && !found){
				slot=j;
				found=true;
			}
		}System.out.println();
		if(found){
			System.out.println(value+" is in slot "+slot+".");
		}else{
			System.out.println(value+" is not in the array.");
		}
	}
}