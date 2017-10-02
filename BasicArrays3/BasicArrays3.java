import java.util.*;
public class BasicArrays3{
	public static void main(String[] args){
	int a[]=new int[1000];
	Random r = new Random();
	
	for(int i=0; i<a.length; i++){
		a[i] = 10 + r.nextInt(90);
		System.out.print(a[i]+"\t");
	}
	}
}