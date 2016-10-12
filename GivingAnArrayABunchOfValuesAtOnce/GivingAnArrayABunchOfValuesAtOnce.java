public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo"};
	int[] arr2 ={11, 23, 37, 41, 53};
		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ ){
			System.out.print( arr1[i] + " " );
		}System.out.println();
		System.out.println("The second array is filled with the following values:\t");
		System.out.print("\t\t");
		for ( int j=0; j<arr2.length; j++ ){
			System.out.print(arr2[j] + "\t ");	
		}
	}
}
