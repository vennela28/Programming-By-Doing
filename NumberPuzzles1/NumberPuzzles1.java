public class NumberPuzzles1{
	public static void main(String[] args){
	for ( int a = 10; a < 100; a ++ )
		{
			for ( int b = 10; b < 100; b++ )
			{
				if ( (a + b) == 60 && (a - b) == 14 )
					System.out.println( "(" + a + ", " + b + ")" );
			}
		}
	}
}