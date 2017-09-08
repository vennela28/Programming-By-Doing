public class CompareToChallenge{
	public static void main(String[] args){
	System.out.print("Comparing \"axe\" with \"cat\" produces ");
	int i = "axe".compareTo("cat");
	System.out.println(i);

	System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
	System.out.println( "applebee's".compareTo("apple") );
	
	String str1 = "Strings are immutable";
	String str2 = "Strings are immutable";
    String str3 = "Integers are not immutable";
	String str4 = "Tesla";
	String str5 = "Benz";
	String str6 = "Lexus";
	String str7 = "BMW";
	String str8 = "Zen";

    System.out.print("Comparing \"Strings are immutable\" with \"Strings are immutable\" produces ");
    int result = str1.compareTo( str2 );
	System.out.println(result);
	  
	System.out.print("Comparing \"Strings are immutable\" with \"Strings are immutable\" produces ");
    result = str2.compareTo( str3 );
    System.out.println(result);
	 
	System.out.print("Comparing \"Tesla\" with \"Benz\" produces ");
    result = str4.compareTo( str5 );
    System.out.println(result);
	
	System.out.print("Comparing \"Benz\" with \"Tesla\" produces ");
	result = str5.compareTo( str4 );
    System.out.println(result);
	
	System.out.print("Comparing \"Lexus\" with \"BMW\" produces ");
	result = str6.compareTo( str7 );
    System.out.println(result);
	
	System.out.print("Comparing \"BMW\" with \"Zen\" produces ");
	result = str7.compareTo( str8 );
    System.out.println(result);
	
	System.out.print("Comparing \"BMW\" with \"Tesla\" produces ");
	result = str7.compareTo( str4 );
    System.out.println(result);
	
	System.out.print("Comparing \"Benz\" with \"Lexus\" produces ");
	result = str5.compareTo( str6 );
    System.out.println(result);
	
	System.out.print("Comparing \"Lexus\" with \"Benz\" produces ");
	result = str6.compareTo( str5 );
    System.out.println(result);
	
	System.out.print("Comparing \"BMW\" with \"BMW\" produces ");
	result = str7.compareTo( str7 );
    System.out.println(result);
	}
}