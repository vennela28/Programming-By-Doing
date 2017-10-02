public class NumberPuzzles4{
	public static void main(String[] args){
	for(int a=1; a<45; a++){
		for(int b=1; b<45; b++){
			for(int c=1; c<45; c++){
				for(int d=1; d<45; d++){
					if ( (a + b + c + d) == 45 && (a + 2) == (b - 2) && (b - 2) == (c * 2) && (c *2) == (d / 2) )
						System.out.println( a + " + " + b + " + " + c + " + " + d +" = 45");
				}
			}
		}
	}
	}
}