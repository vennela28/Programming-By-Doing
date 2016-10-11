import java.util.*;
public class BasicArrays3{
	public static void main(String[] args){
	int a[]=new int[1000];
	Random r = new Random();
	int x = 10 + r.nextInt(99);
	for(int i=0; i<a.length; i++){
		System.out.print(10+r.nextInt(90)+"  ");
	}
	}
}