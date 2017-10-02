import java.util.*;
public class CopyingArrays{
	public static void main(String[] args){
		Random r = new Random();
		int x = 1+r.nextInt(100);
		int arr[] = new int[10];
		int arr1[] = new int[10];
		System.out.print("Array 1: ");
		for(int a=0; a<arr.length; a++){
			arr[a] = 1+r.nextInt(100);
			System.out.print(arr[a]+"  ");
		}
		arr1 = arr;
		arr[arr.length - 1] = -7;
		System.out.println();
		
		System.out.print("Array 2: ");
		for(int b=0; b<arr1.length; b++){
			System.out.print(arr1[b]+"  ");
		}	
	}
}