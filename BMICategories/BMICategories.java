import java.util.Scanner;
public class BMICategories{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your height (inches only): ");
		double height = keyboard.nextDouble();
		String category="";
		
		System.out.print("Your weight in pounds: ");
		int weight = keyboard.nextInt();
		System.out.println();
		
		double bmi=(weight/(height*height))*703;
		double roundOff = Math.round(bmi*100.0)/100.0;
       	System.out.print("Your BMI is "+roundOff);
		System.out.println();
		
		if(bmi<15.0){
			category="very severely underweight";
		}else if(bmi>=15.0 && bmi<=16.0){
			category="severely underweight";
		}else if(bmi>=16.1 && bmi<=18.4){
			category="underweight";
		}else if(bmi>=18.5 && bmi<=24.9){
			category="normal weight";
		}else if(bmi>=25.0 && bmi<=29.9){
			category="overweight";
		}else if(bmi>=30.0 && bmi<=34.9){
			category="moderately overweight";
		}else if(bmi>=35.0 && bmi<=39.9){
			category="severely obese";
		}else if(bmi>=40.0){
			category="very severely (or \"morbidly\") obese";
		}
		System.out.print("BMI Category: "+category);
	}
}