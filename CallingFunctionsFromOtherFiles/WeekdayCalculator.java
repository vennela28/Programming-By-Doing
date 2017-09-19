import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm, dd, yyyy) );
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, year_diff, total = 0;
		String date = "";
		
		year_diff = yyyy - 1900;

		// bunch of calculations go here 
		// from Program By Doing instructions
		total += year_diff;
		total += (year_diff / 4);
		total += dd;
		total += month_offset(mm);		
		if ( is_leap(yyyy) && (mm == 1 || mm == 2) )
			total -= 1;
		
		// formatting string to match output of example
		date = weekday_name( total % 7 )+ ", " + month_name(mm) + " " + dd + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	public static String month_name( int month )
	{
		String result;

		if ( month == 1 )
			result = "January";
		else if ( month == 2 )
			result = "February";
		else if ( month == 3 )
			result = "March";
		else if ( month == 4 )
			result = "April";
		else if ( month == 5 )
			result = "May";
		else if ( month == 6 )
			result = "June";
		else if ( month == 7 )
			result = "July";
		else if ( month == 8 )
			result = "August";
		else if ( month == 9 )
			result = "September";
		else if ( month == 10 )
			result = "October";
		else if ( month == 11 )
			result = "November";
		else if ( month == 12 )
			result = "December";
		else 
			result = "error";
		
		return result;
	}
	
	public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 || weekday == 0 )
		{
			result = "Saturday";
		}
		else
		{
			result = "error";
		}
		
		return result;
	}

	public static int month_offset( int month )
	{
		int result;
		
		switch(month)
		{
			case  1:
			case 10: result = 1;
					 break;
			case  2:
			case  3:
			case 11: result = 4;
					 break;
			case  4:
			case  7: result = 0;
					 break;
			case  5: result = 2;
					 break;
			case  6: result = 5;
					 break;
			case  8: result = 3;
					 break;
			case  9:
			case 12: result = 6;
					 break;
			default: result = -1;	
		}
		return result;
	}

	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}