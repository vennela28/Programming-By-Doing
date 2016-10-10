import java.util.Scanner;
public class BMICalc{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your height (feet only): ");
		double heightFt = keyboard.nextDouble();
		System.out.print("Your height (inches only): ");
		double heightIn = keyboard.nextDouble();
		double height = 12*heightFt+heightIn;
		System.out.print("Your weight in pounds: ");
		int weight = keyboard.nextInt();
		System.out.println();
		double bmi=(weight/(height*height))*703;
		double roundoff = Math.round(bmi*100.0)/100.0;
		System.out.print("Your BMI is "+roundoff);
	}
}