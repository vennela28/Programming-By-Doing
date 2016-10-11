public class AmstrongNumbers{
	public static void main(String[] args){
	for ( int hundreds = 1; hundreds < 10; hundreds++ )
		{
			for ( int tens = 0; tens < 10; tens++ )
			{
				for ( int ones = 0; ones < 10; ones++ )
				{
					if ( (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3)) == ( (hundreds * 100) + (tens * 10) + ones) ) 
						System.out.println( ((hundreds * 100) + (tens * 10) + ones) );
				}
			}
		}
	}
}