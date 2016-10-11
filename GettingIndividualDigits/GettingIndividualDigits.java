public class GettingIndividualDigits{
	public static void main(String[] args){
	for(int i=10; i<=99; i++){
	
		int j = i%10;
		int k = i/10;
		int sum = j+k;
		System.out.println(i+", "+k+" + "+j+" = "+sum);
	}
	}
}