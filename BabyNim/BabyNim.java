import java.util.*;
public class BabyNim{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int pileA=3;
		int pileB=3;
		int pileC=3;
		
		String pile="";
		int remove;
		
		while(pileA>0 || pileB>0 || pileC>0){
			System.out.println("A. "+pileA+"	B. "+pileB+"	C. "+pileC);
			System.out.println();
			System.out.print("Choose a pile: ");
			pile = keyboard.next();
			
			System.out.print("How many to remove from pile "+pile+": ");
			remove = keyboard.nextInt();
			
			if(pile.equals("A")){
				pileA = pileA - remove;
				System.out.println();
			}else if(pile.equals("B")){
				pileB = pileB - remove;
				System.out.println();
			}else if(pile.equals("C")){
				pileC = pileC - remove;
				System.out.println();
			}if(pileA<=0 && pileB <= 0 && pileC <= 0) 
            {
				System.out.println("A. "+pileA+"	B. "+pileB+"	C. "+pileC);
				System.out.println();
                System.out.print("All piles are empty. Good job!");
			}
		}
	}
}