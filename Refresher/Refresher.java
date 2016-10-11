import java.util.*;
public class Refresher{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your name: ");
	String name = keyboard.next();
	System.out.println();
	if(name.equals("gump")){
		for(int i=1; i<=10; i++){
			System.out.println(name);
		}
	}
	if(name.equals("Mitchell")){
		for(int i=1; i<=5; i++){
			System.out.println(name);
		}
	}
	}
}