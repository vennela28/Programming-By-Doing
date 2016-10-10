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

    int result = str1.compareTo( str2 );
    System.out.println(result);
	  
    result = str2.compareTo( str3 );
    System.out.println(result);
	 
    result = str3.compareTo( str1 );
    System.out.println(result);
	
	
	
	}
}