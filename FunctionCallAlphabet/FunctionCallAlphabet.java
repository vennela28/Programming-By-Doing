// Function Call Alphabet - Yet another program to practice functions, but this time it's function calls only.

public class FunctionCallAlphabet
{
	public static void main( String[] args )
	{
		 a();    // displays a word beginning with A
		 System.out.print(b());    // returns the word to be displayed
		 c(true);    // pass it 'true' and it will display a word beginning with C
		 d();    // displays a word beginning with D
		 e(9);    // pass it the number of letters to display (9)
		 f("Frog");    // displays the word you pass it beginning with "F"
		 System.out.print(g());    // returns the word to be displayed
		 h(1);    // tell it how many times to display the word (1)
		
		System.out.println();

		 i(30);    // pass it any integer and it will display a word beginning with I 
		 System.out.print(j(3));    // returns a different word depending on what you pass it (1-3)
		 k();    // displays a word beginning with K
		 l(true, false);    // displays a different word depending on the two booleans you pass it
		 m(false, false);    // displays a different word depending on the two booleans you pass it
		 n("Narwhal");    // displays the word you pass it beginning with "N"
		 o();    // displays a word beginning with O and returns a useless value
		 System.out.print(p());    // returns the word to be displayed
		 q();    // displays the word
		
		System.out.println();

		 System.out.print(r(true));    // returns a different word depending on if you pass it 'true' or 'false'
		 s(6);    // pass it the number of letters to display (6)
		 t("Thyme");    // displays the word you pass it beginning with "T"
		 System.out.print(u());    // returns the word to be displayed
		 v(1);    // tell it how many times to display the word (1)
		 w(6);    // pass it any integer and it will display a word beginning with W 
		 System.out.print(x(2));    // returns a different word depending on what you pass it (1-2)
		 y();    // displays a word beginning with Y
		 System.out.print(z(true, true));    // returns a different word depending on which two boolean values you pass it
		
		System.out.println();
	}

	/**************************************
	 * Don't change anything below here!! *
	 *************************************/

	public static void a()
	{
		System.out.print("Ant ");
	}

	public static String b()
	{
		return "Banana ";
	}

	public static void c(boolean doit)
	{
		if ( doit )
			System.out.print("Crocodile ");
	}

	public static void d()
	{
		System.out.print("Doggie ");
	}

	public static void e(int howmany)
	{
		String s;
		s = "Elephant ";
		int x = 0;
		while ( x < howmany )
		{
			System.out.print( s.charAt(x) );
			x = x+1;
		}
		
	}

	public static void f(String word)
	{
		System.out.print(word + " ");
	}

	public static String g()
	{
		return "Gorilla ";
	}

	public static void h(int reps)
	{
		int x = 0;
		while ( x < reps )
		{
			System.out.print("Horseradish ");
			x = x+1;
		}

	}

	public static void i(int ignoredparameter)
	{
		ignoredparameter = 32;
		String space = Character.toString( (char) ignoredparameter );
		System.out.print("Ice_cream" + space);
	}

	public static String j(int whichone)
	{
		if ( whichone == 1 )
			return "Jambalaya ";
		else if ( whichone == 2 )
			return "Juniper ";
		else
			return "Jackrabbit ";
	}

	public static void k()
	{
		// the bird OR the fruit
		System.out.print("Kiwi ");
	}

	public static void l(boolean a, boolean b)
	{
		if ( a && b )
			System.out.print("Lettuce ");
		else
			System.out.print("Lhasa_apso ");
	}

	public static void m(boolean a, boolean b)
	{
		if ( a || b )
			System.out.print("Mango ");
		else
			System.out.print("Monkey! ");
	}

	public static void n(String word)
	{
		System.out.print(word + " ");
	}

	public static int o()
	{
		System.out.print("Orangutan ");
		return 1;	// just for kicks; the return value doesn't mean anything
	}

	public static String p()
	{
		return "Parrot ";
	}

	public static void q()
	{
		System.out.print("Quail ");
	}

	public static String r(boolean first)
	{
		if ( first )
			return "Rabbit ";
		else
			return "Radish ";
	}

	public static void s(int howmany)
	{
		String s;
		s = "Snake ";
		int x = 0;
		while ( x < howmany )
		{
			System.out.print( s.charAt(x) );
			x = x+1;
		}
	}

	public static void t(String word)
	{
		System.out.print(word + " ");
	}

	public static String u()
	{
		return "Ugli_fruit ";
	}

	public static void v(int reps)
	{
		int x = 0;
		while ( x < reps )
		{
			System.out.print("Valentine_candy ");
			x = x+1;
		}
	}

	public static void w(int ignoredparameter)
	{
		ignoredparameter = 32;
		String space = Character.toString( (char) ignoredparameter );
		System.out.print("Walrus" + space);
	}

	public static String x(int whichone)
	{
		if ( whichone == 1 )
			return "X_files ";
		else
			return "X_men ";
	}

	public static void y()
	{
		System.out.print("Yams ");
	}

	public static String z(boolean a, boolean b)
	{
		if ( a || b )
			return "Zanahorias ";
		else
			return "Zebra ";
	}
}
