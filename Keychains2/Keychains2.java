import java.util.*;
public class Keychains2{
	public static void main(String[] args){
		int k =0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe");
		System.out.println();
		int choice = 0;
		int price = 10;
		while(choice !=4){
		System.out.println("1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		System.out.println();
		System.out.print("Please enter your choice: ");
		choice = keyboard.nextInt();
	
		if(choice == 1){
			k=add_keychains(k);
			System.out.println();
		}else if(choice ==2){
			k = remove_keychains(k);
			System.out.println();
		}else if(choice==3){
			view_order(k);
			System.out.println();
		}else if(choice==4){
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.println("CHECKOUT");
			System.out.println();
			System.out.print("What is your name? ");
			String name = s.next();
			view_order(k);
			System.out.print("Thanks for your order, "+name);
			
		}
		}
		
	}
	public static int add_keychains(int k){
		Scanner s = new Scanner(System.in);
		System.out.print("You have "+k+" keychains. How many to add? ");
		int add = s.nextInt();
		k = k+add;
		System.out.println("You now have "+k+" keychains.");
		//System.out.print(k);
		return k;
	}
	public static int remove_keychains(int k){
		Scanner s = new Scanner(System.in);
		System.out.print("You now have "+k+" keychains. How many to remove? ");
		int remove = s.nextInt();
		int remain = k - remove;
		System.out.println("You now have "+remain+" keychains.");
		return remain;
	}public static int view_order(int k){
		System.out.println("You now have "+k+" keychains.");
		System.out.println("Keychains cost $10 each.");
		int price = k*10;
		System.out.println("Total cost is $"+price+".");
		return price;
	}

}