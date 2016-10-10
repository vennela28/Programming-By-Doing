public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
				System.out.print(" Mr. Mitchell is cool.    \r");
			else if ( i%10 == 1 )
				System.out.print(" 1. Mr. Mitchell is co    \r");
			else if ( i%10 == 2 )
				System.out.print(" ol. 1. Mr. Mitchell is   \r");
			else if ( i%10 == 3 )
				System.out.print(" cool. 1. Mr. Mitchell    \r");
			else if ( i%10 == 4 )
				System.out.print(" is cool. 1. Mr. Mitch    \r");
			else if ( i%10 == 5 )
				System.out.print(" ell is cool. 1. Mr.      \r");
			else if ( i%10 == 6 )
				System.out.print("  Mitchell. 1. Mr. Mi     \r");
			else if ( i%10 == 7 )
				System.out.print("  tchell is cool. 1. Mr.  \r");
			else if ( i%10 == 8 )
				System.out.print("  Mitchell is cool. 1.M   \r");
			else if ( i%10 == 9 )
				System.out.print("  r. Mitchell is cool. 1  \r");
			else if ( i%10 == 10 )
				System.out.print("  . Mr. Mitchell is coo   \r");
			else if ( i%10 == 11 )
				System.out.print("  l. 1. Mr. Mitchell      \r");
			else if ( i%10 == 12 )
				System.out.print("  is cool. 1. Mr. Mitche  \r");
			else if ( i%10 == 13 )
				System.out.print("  ll is cool. 1. Mr. Mi   \r");
			else if ( i%10 == 14 )
				System.out.print("   tchell is cool. Mr.    \r");
			else if ( i%10 == 15 )
				System.out.print("   Mitchell is cool.      \r");

			Thread.sleep(200);
		
		}
	}
}