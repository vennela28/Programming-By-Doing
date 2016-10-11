import java.util.*;

public class BasicArrayLists3{
	public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=1; i<=1000; i++){
		al.add(getNumbers());
		
	}System.out.println("ArrayList: "+al);
	}
	public static int getNumbers(){
		Random r = new Random();
		int x = r.nextInt(90) + 10;
		return x;
	}
}