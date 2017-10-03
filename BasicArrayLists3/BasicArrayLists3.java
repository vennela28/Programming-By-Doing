import java.util.*;

public class BasicArrayLists3{
	public static void main(String[] args)
	{
		printArray(1000);
	}
	
	static void printArray(int size){
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=0; i<size; i++){
		al.add(getNumbers());
		
		}System.out.print("Array List: "+al+"\t");
	}
	
	static int getNumbers(){
		Random r = new Random();
		int x = r.nextInt(90) + 10;
		return x;
	}
	
}