import java.util.Scanner;
public class AlphabeticalOrder{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What\'s your last name? ");
		String lname=keyboard.next();
		if(lname.compareTo("Carswell")<=0){
			System.out.println("You don\'t have to wait long, "+lname);
		}else if(lname.compareTo("Jones")<=0){
			System.out.println("That\'s not bad, "+lname);
		}else if(lname.compareTo("Smith")<=0){
			System.out.println("Looks like a bit of wait, "+lname);
		}else if(lname.compareTo("Young")<=0){
			System.out.println("It\'s gonna be a while, "+lname);
		}else if(lname.compareTo("Young")>=0){
			System.out.println("Not going anywhaere for a while? "+lname);
		}
		else{
			System.out.println("error");
		}
	}
}