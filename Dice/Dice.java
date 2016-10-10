import java.util.*;
public class Dice{
	public static void main(String[] args){
	System.out.println("HERE COMES THE DICE!");
	System.out.println();
	Random r = new Random();
	int x = 1+r.nextInt(6);
	
	int roll1 = 1+r.nextInt(6); 
	System.out.print("Roll #1: "+roll1);
	System.out.println();
	
	int roll2 = 1+r.nextInt(6); 
	System.out.print("Roll #2: "+roll2);
	int sum = roll1+roll2;
	System.out.println();
	System.out.print("The total is "+sum+"!");
	}
}