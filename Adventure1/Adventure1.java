import java.util.Scanner;
public class Adventure1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		System.out.print("> ");
		String ans = keyboard.next();
		System.out.println(" ");
	if(ans.equals("kitchen")){
		System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
		System.out.print("> ");
		ans=keyboard.next();
		if(ans.equals("refrigerator")){
			System.out.println(" ");
			System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
			System.out.print("> ");
			ans=keyboard.next();
			if(ans.equals("yes")){
				System.out.println();
				System.out.println("There is a cupcake for you to taste.");
			}else if(ans.equals("no")){
				System.out.println(" ");
				System.out.println("You die of starvation... eventually.");
			}
		}else if(ans.equals("cabinet")){
			System.out.println(" ");
			System.out.println("Check out your clothes and jewels for the evening party!!!");
			System.out.print("> ");
			ans=keyboard.next();
			if(ans.equals("yes")){
				System.out.println();
				System.out.println("WOW!!! You can try out the long red gown with ruby set and the red sandals!");
			}else if(ans.equals("no")){
				System.out.println(" ");
				System.out.println("You have nothing to do in the evening!");
			}
		}
	}else if(ans.equals("upstairs")){
		System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
		System.out.print("> ");
		ans=keyboard.next();
		if(ans.equals("bedroom")){
			System.out.println(" ");
			System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
			System.out.print("> ");
			ans=keyboard.next();
			if(ans.equals("yes")){
				System.out.println(" ");
				System.out.println("Here is a collection of your books to read in your leisure time!");
			}else if(ans.equals("no")){
				System.out.println(" ");
				System.out.println("How will you pass out your free time?");
			}
		}else if(ans.equals("bathroom")){
			System.out.println(" ");
			System.out.println("You are in your bathroom which has a bthtub and your body shower gel. Would you like to have bath after a hectic day at work? (\"yes\" or \"no\")");
			System.out.print("> ");
			ans=keyboard.next();
			if(ans.equals("yes")){
				System.out.println(" ");
				System.out.println("Have warm water bath in your bathtub!");
			}else if(ans.equals("no")){
				System.out.println(" ");
				System.out.println("You have been tired and nasty for the whole day. Don't you want to have bath?");
			}
		}
	}
}
}