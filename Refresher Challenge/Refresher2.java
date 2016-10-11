import java.util.*;
public class Refresher2{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Your name: ");
	String name = keyboard.next();
	System.out.println();
	int loop =10;
	if(name.equals("Mitchell")){
		loop = 5;
	}
	for(int i=1; i<=loop; i++){
		System.out.println(name);
	}
}
}