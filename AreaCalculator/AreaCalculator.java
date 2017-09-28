import java.util.*;
public class AreaCalculator{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
	
	while(true){
	System.out.println();
	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println();
	System.out.println("1) Triangle");
	System.out.println("2) Rectangle");
	System.out.println("3) Square");
	System.out.println("4) Circle");
	System.out.println("5) Quit");
	System.out.print("Which shape: ");
	int shape = keyboard.nextInt();
	System.out.println();
	
	if(shape == 1){
		area_triangle(5,6);
	}else if(shape == 2){
		area_rectangle(4,5);
	}else if(shape == 3){
		area_square(4);
	}else if(shape == 4){
		area_circle(4);
	}else if(shape == 5){
		quit();
		break;
	}
	}}
	public static double area_triangle(int base, int height){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Base: ");
		base = keyboard.nextInt();
		System.out.print("Height: ");
		height = keyboard.nextInt();
		System.out.println();
		int A=(base*height)/2;
		System.out.println("The area is "+A+".");
		return A;
	}
	public static int area_rectangle(int length, int width){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Length: ");
		length = keyboard.nextInt();
		System.out.print("Width: ");
		width = keyboard.nextInt();
		System.out.println();
		int A=length*width;
		System.out.println("The area is "+A+".");
		return A;
	}
	public static int area_square(int side){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Side: ");
		side = keyboard.nextInt();
		System.out.println();
		int A=side*side;
		System.out.println("The area is "+A+".");
		return A;
	}public static double area_circle(int radius){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius: ");
		radius = keyboard.nextInt();
		System.out.println();
		double A=Math.PI*radius*radius;
		System.out.println("The area is "+A+".");
		return A;
	}
	public static String quit(){
		System.out.println("GoodBye");
		return null;
	}
}