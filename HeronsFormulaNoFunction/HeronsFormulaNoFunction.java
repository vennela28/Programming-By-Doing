public class HeronsFormulaNoFunction
{
	public static void main( String[] args )
	{
		int a, b, c;
		double s, A;
		
		a = 3;
		b = 3;
		c = 3;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 3,3,3 has an area of " + A );

		a = 3;
		b = 4;
		c = 5;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 3,4,5 has an area of " + A );
 
		a = 7;
		b = 8;
		c = 9;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 7,8,9 has an area of " + A );

		a = 5;
		b = 12;
		c = 13;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 5,12,13 has an area of " + A );

		a = 10;
		b = 9;
		c = 11;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + A );
		
		a = 8;
		b = 15;
		c = 17;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + A );
		
		a = 9;
		b = 9;
		c = 9;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 9,9,9 has an area of " + A );
	}
}
