import java.util.*;
public class DiceDoubles{
	public static void main(String[] args){
	System.out.println("HERE COMES THE DICE!");
	System.out.println();
	Random r = new Random();
	int roll1=0;
	int roll2=0;
	roll1 = 1+r.nextInt(6); 
	roll2 = 1+r.nextInt(6); 
	while(roll1!=roll2){
		System.out.println("Roll #1: "+roll1);
		System.out.println("Roll #2: "+roll2);
		int sum = roll1+roll2;
		System.out.println("The total is "+sum+"!");
		System.out.println();
		int roll3 = 1+r.nextInt(6); 
		int roll4 = 1+r.nextInt(6); 
		roll1=roll3;
		roll2=roll4;
	}
	  System.out.println();
	  System.out.println("Roll #1: "+roll1);
	  System.out.println("Roll #2: "+roll2);
	  System.out.println("The total is "+(roll1+roll2)+"!");
	  
	}
}