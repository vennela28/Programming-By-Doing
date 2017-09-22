import java.util.Random;

public class BubbleSort
{
	public static void bubble_sort( int[] a )
	{
		// Your code goes here
		boolean keep_sort = true;
		int j = 0;
		
		while ( keep_sort )
		{
			keep_sort = false;
			j++;
			for ( int i = 0; i < a.length - j; i++ )
			{
				if ( a[i] > a[i + 1] )
				{
					swap( a, i, i + 1 );
					keep_sort = true;
				}
			}
		}
	}


	public static void swap( int[] a , int i, int j )
	{
		// Your code goes here
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
		bubble_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}