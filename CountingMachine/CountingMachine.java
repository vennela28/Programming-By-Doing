import java.util.*;
public class CountingMachine{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Count to: ");
	int num=keyboard.nextInt();
	for(int i=0; i<=num; i++){
		System.out.print(i+" ");
	}
	}
}