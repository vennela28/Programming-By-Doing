import java.util.Scanner;
public class Adventure2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int nextroom=1;
		String choice="";
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE 2!");
		System.out.println();
		while(nextroom!=0){
			if(nextroom==1){
				System.out.println();
				System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("upstairs") )
					nextroom = 2;
				else if ( choice.equals("kitchen") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}if(nextroom==2){
				System.out.println();
				System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Or, you can go back \"downstairs\". Where would you like to go?");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if(choice.equals("downstairs")){
					nextroom=1;
				}else if(choice.equals("bedroom")){
					System.out.println();
					System.out.println("Have a beautiful sleep.");
					nextroom=1;
				}else if(choice.equals("bathroom")){
					System.out.println();
					System.out.println("Going to have a warm cosy bath after all the tiredness.");
					nextroom=1;
				}
			}if(nextroom==3){
				if(choice.equals("kitchen")){
					System.out.println();
					System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or go \"back\".");
					System.out.print( "> " );
					choice = keyboard.nextLine();
					}if(choice.equals("refrigerator")){
					System.out.println();
					System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
					System.out.print( "> " );
					choice = keyboard.nextLine();
					if(choice.equals("yes")){
						System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach starts jumping like a frog in hot water. You feel faint. Sliding to the floor, the darkness closes in.");
						System.out.println();
						System.out.println("You have died.");
					}else{
						System.out.println();
						System.out.println("You will die starving.");
						nextroom=1;
					}
				}else if(choice.equals("back")){
					nextroom=1;
				}
			}
		}
	}
}