// Fill-In Functions - Fix the broken functions and function calls.

public class FillInFunctions
{
	public static void main( String[] args )
	{
		// Fill in the function calls where appropriate.

		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = '!';
		randchar();
		System.out.println("The character is: " + randchar() +" (or whatever)" );

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(-10, 10);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x, y = 99;
		x = -10;
		abso(-10);
		System.out.println("|" + x + "| = " + abso(x) );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}


	public static String credits()
	// No parameters.
	{
		// displays some boilerplate text saying who wrote this program, etc.
		String result="";
		String name="Vennela Sunnam";
		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by "+name);
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

		return result;
	}




	public static char randchar()
	// No parameters.
	{
		// chooses a random character in the range "A" to "Z"
		
		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);

		return charval;
	}




	public static int counter(int start, int stop)
	// Parameters are:
	//     int start;
	//     int stop;
	{
		// counts from start to stop by ones
		int ctr;

		ctr = start;
		while ( ctr <= stop )
		{
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}

		return ctr;
	}




	public static int abso( int value )
	// Parameters are:
	   
	{
		// finds the absolute value of the parameter
		int absval;

		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}


}

