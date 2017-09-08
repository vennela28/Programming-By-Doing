import java.util.*;
public class TwoMoreQuestions{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String ans, ans1;
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println();
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println();
		System.out.print("Question 1) Does it stay inside or outside or both? ");
		ans = keyboard.next();
		System.out.print("Question 2) Is it a living thing? ");
		ans1 = keyboard.next();
		System.out.println();
		
		if(ans.equals("inside") && ans1.equals("yes")){
			System.out.println("Then what else could you be thinking of besides a houseplant?!?");
		}else if(ans.equals("outside") && ans1.equals("yes")){
			System.out.println("Then what else could you be thinking of besides a bison?!?");
		}else if(ans.equals("both") && ans1.equals("yes")){
			System.out.println("Then what else could you be thinking of besides a dog?!?");
		}else if(ans.equals("inside") && ans1.equals("no")){
			System.out.println("Then what else could you be thinking of besides a shower curtain?!?");
		}else if(ans.equals("outside") && ans1.equals("no")){
			System.out.println("Then what else could you be thinking of besides a billborad?!?");
		}else if(ans.equals("both") && ans1.equals("no")){
			System.out.println("Then what else could you be thinking of besides a cell phone?!?");
		}
	
	}
}
