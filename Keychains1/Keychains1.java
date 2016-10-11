import java.util.*;
public class Keychains1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
	System.out.println("Ye Olde Keychain Shoppe");
	System.out.println();
	while(true){
	System.out.println("1. Add Keychains to Order");
	System.out.println("2. Remove Keychains from Order");
	System.out.println("3. View Current Order");
	System.out.println("4. Checkout");
	System.out.println();
	System.out.print("Please enter your choice: ");
	int keychains = keyboard.nextInt();
	System.out.println();
	if(keychains == 1){
		add_keychains();
		System.out.println();
	}else if(keychains == 2){
		remove_keychains();
		System.out.println();
	}else if(keychains == 3){
		view_order();
		System.out.println();
	}else if(keychains == 4){
		checkout();
		break;
	}
	}
	}
	public static String add_keychains(){
			System.out.println("ADD KEYCHAINS");
			return null;
	}public static String remove_keychains(){
			System.out.println("REMOVE KEYCHAINS");
			return null;
	}public static String view_order(){
		System.out.println("VIEW ORDER");
		return null;
	}public static String checkout(){
		System.out.println("CHECKOUT");
		return null;
	}
}