import java.util.Random;

public class ExchangeSort
{
	public static void exchange_sort( int[] a )
	{
		// Your code goes here
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = i + 1; j < a.length; j++ )
			{
				if ( a[i] > a[j] )
					swap( a, i, j );
			}
		}
	}


	public static void swap( int[] a , int i, int j )
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		exchange_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}