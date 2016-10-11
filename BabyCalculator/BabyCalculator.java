import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") && a!=0 ){
				c = a + b;
			}else if ( op.equals("*") && a!=0 ){
				c = a * b;
			}else if ( op.equals("-") && a!=0 ){
				c = a - b;
			}else if ( op.equals("/") && a!=0 ){
				c = a / b;
            }else if(a==0){
			    System.out.println("Bye, now.");
				break;
			}
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);
			
		} while ( true );
	}
}

