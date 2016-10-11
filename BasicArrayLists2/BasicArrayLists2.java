import java.util.*;

public class BasicArrayLists2{
	public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=1; i<=10; i++){
		al.add(getNumbers());
		
	}System.out.println("ArrayList: "+al);
	}
	public static int getNumbers(){
		Random r = new Random();
		int x = 1+r.nextInt(100);
		return x;
	}
}