import java.util.*;
public class BasicArrays2{
	public static void main(String[] args){
		Random r = new Random();
		
		int a[]=new int[10];
		for(int i=0; i<a.length; i++){
			a[i]=1 + (int)(Math.random()*100);
			System.out.println("Slot "+i+" contains a "+a[i]);
		}
	}
}