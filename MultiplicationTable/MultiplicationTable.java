public class MultiplicationTable{
	public static void main(String[] args){
	System.out.println("x  | 1\t2\t3\t4\t5\t6\t7\t8\t9 ");
	System.out.println("===+=================================================================");
	for(int x=1; x<=12; x++){
		if (x < 10 )
				System.out.print ( " " + x + " | " );
			else
				System.out.print ( x + " | " );
		
		for(int j=1; j<=9; j++){
			System.out.print((x*j)+"\t");
	
	}System.out.println();
		
	
	}
}
}