import java.util.*;
public class DisplayingSomeMultiples{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Choose a number: ");
	int choice = keyboard.nextInt();
	System.out.println();
	for(int i=1; i<=12; i++){
		System.out.println(choice+"X"+i+" = "+choice*i);
	}
	}
}