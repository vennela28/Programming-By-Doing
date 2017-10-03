public class Euler001{
	public static void main(String args[]){
		int total =0;
		for(int i=1; i<1000; i++){
			if(i%3==0 || i%5==0){
				total = total+i;
			}
		}
		System.out.println();
		System.out.println("Total of all the multiples of 3 or 5 below 1000 is " +total+".");
	}
}