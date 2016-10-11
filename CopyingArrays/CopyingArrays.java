import java.util.*;
public class CopyingArrays{
	public static void main(String[] args){
		Random r = new Random();
		int x = 1+r.nextInt(100);
		int arr[] = new int[10];
		int arr1[] = new int[10];
		
		for(int a=0; a<arr.length; a++){
			int num = 1+r.nextInt(100);
			arr[a]=num;
	}		arr1 = arr;
	
	System.out.print("Array 1: ");
	for(int a=0; a<arr.length; a++){
		System.out.print(arr[a]+"  ");
	}	arr[arr.length - 1] = -7;
		System.out.println();
	System.out.print("Array 2: ");
	for(int b=0; b<arr1.length; b++){
		System.out.print(arr1[b]+"  ");
		
	}	
		
		
		
	}
}