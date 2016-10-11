public class EvenessFunction{
	public static void main(String[] args){
		for(int n=1; n<=20; n++){
			System.out.print(n);
			if(isEven(n) && isDivisibleBy3(n)){
				System.out.print(" <=");
			}else if(isEven(n)){
				System.out.print(" <");
			}else if(isDivisibleBy3(n)){
				System.out.print(" =");
			}
			System.out.println();
		}
	
		
	}
	public static boolean isEven(int n){
		boolean two = false;
		if(n%2==0){
			two = true;
		}return two;
	}
	public static boolean isDivisibleBy3(int n){
		boolean three = false;
		if(n%3==0){
			three = true;
		}return three;
	}
}
