import java.util.*;
public class BabyBlackjack{
	public static void main(String[] args){
		Random r = new Random();
		int ui = 1+r.nextInt(10);
		int uj = 1+r.nextInt(10);
		int sum = ui+uj;
		int di = 1+r.nextInt(10);
		int dj = 1+r.nextInt(10);
		int sum1 = di+dj;
		System.out.println("Baby Blackjack!");
		System.out.println();
		System.out.println("You drew "+ui+" and "+uj);
		System.out.println("Your total is "+sum);
		System.out.println();
		System.out.println("The dealer drew "+di+" and "+dj);
		System.out.println("Dealer's total is "+sum1);
		System.out.println();
		if(sum>sum1){
			System.out.println("YOU WIN!");
		}else{
			System.out.println("YOU LOSE!");
		}
	
	}
}