import java.util.*;
@SuppressWarnings("unchecked")
public class BasicArrayLists1{
	public static void main(String[] args){
	ArrayList listTest = new ArrayList();
		listTest.add( "-113" );
		for(int i=0; i<10; i++){
			 System.out.println( "Slot "+i+" contains a " + listTest.get(0) );
		}
       
	}
}