import java.util.Scanner;
public class SpaceBoxing{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your current earth weight(in lbs.): ");
		double weight=keyboard.nextDouble();
		
		System.out.println();
		
		System.out.println("I have information for the following planets:");
		System.out.println("1. Venus   2. Mars    3. Jupiter");
		System.out.println("4. Saturn  5. Uranus  6. Neptune");
		System.out.println();
		System.out.print("Which planet are you visiting? ");
		int choice=keyboard.nextInt();
		System.out.println();
		if(choice==1){
			weight=weight*0.78;
		}else if(choice==2){
			weight=weight*0.39;
		}else if(choice==3){
			weight=weight*2.65;
		}else if(choice==4){
			weight=weight*1.17;
		}else if(choice==5){
			weight=weight*1.05;
		}else if(choice==6){
			weight=weight*1.23;
		}
		System.out.println();
		System.out.print("Your weight would be "+weight+" pounds on that planet.");
	}
}