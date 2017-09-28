import java.util.*;
public class Nim {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 4;
        int pileC = 5;
        int turns = 0;
        int removal = 0;
        String player1;
        String player2;
        String currentPlayer ="";

        //get player's names
        System.out.print("Player 1, enter your name: ");
        player1 = keyboard.nextLine();
        System.out.print("Player 2, enter your name: ");
        player2 = keyboard.nextLine();

        //show the stars per pile
        while(pileA>0 || pileB > 0 || pileC >0) {
            if (turns %2 ==0){
                currentPlayer = player1;
            }else if(turns %2 >0){
                currentPlayer = player2;
            }
            System.out.print("\r\nA: ");
            for (int i = 0; i<pileA;i++){
                System.out.print("*");
            }
            System.out.print("\r\nB: ");
            for (int i = 0; i<pileB;i++){
                System.out.print("*");
            }
            System.out.print("\r\nC: ");
            for (int i = 0; i<pileC;i++){
                System.out.print("*");
            }
            System.out.println();
            //prompt for another choice
            System.out.print("\r\n" + currentPlayer + ", choose a pile: ");

            String choice = keyboard.nextLine();
            
            //can only pick from a pile that is greater than 0
            while (choice.equals("A") && pileA<=0) {
                System.out.print("Nice try, "+currentPlayer+". That pile is empty. Choose again: ");
                choice = keyboard.nextLine();
            }while (choice.equals("B") && pileB<=0) {
                System.out.print("Nice try, "+currentPlayer+". That pile is empty. Choose again: ");
                choice = keyboard.nextLine();
            } while (choice.equals("C") && pileC<=0) {
                System.out.print("Nice try, "+currentPlayer+". That pile is empty. Choose again: ");
                choice = keyboard.nextLine();
            }
            //prompt for removal from pile
            System.out.print("How many to remove from pile " + choice + ": ");
            removal = keyboard.nextInt();
            if (choice.equals("A")) {
                while(removal>pileA){
                    System.out.print("Pile A doesn't have that many. Try again: ");
                    removal = keyboard.nextInt();
                }
                    pileA = pileA - removal;
            } else if (choice.equals("B")) {
                while(removal>pileB){
                    System.out.print("Pile B doesn't have that many. Try again: ");
                    removal = keyboard.nextInt();
                }
                    pileB = pileB - removal;
            } else if (choice.equals("C")) {
                while(removal>pileC){
                    System.out.print("Pile C doesn't have that many. Try again: ");
                    removal = keyboard.nextInt();
                }
                    pileC = pileC - removal;
            }
            keyboard.nextLine();
            ++turns; //keep count of # of turns
            
            //who's the winner?
            if (pileA+pileB+pileC==1 && currentPlayer.equals(player1)){
				System.out.print("\r\nA: ");
				for (int i = 0; i<pileA;i++){
					System.out.print("*");
				}
				System.out.print("\r\nB: ");
				for (int i = 0; i<pileB;i++){
					System.out.print("*");
				}
				System.out.print("\r\nC: ");
				for (int i = 0; i<pileC;i++){
					System.out.print("*");
				}
				System.out.println();
				System.out.println();
                System.out.println(player2+", you must take the last remaining counter, so you lose. "+player1+" wins!");
                break;
            }else if (pileA+pileB+pileC==1 && currentPlayer.equals(player2)){
				System.out.print("\r\nA: ");
				for (int i = 0; i<pileA;i++){
					System.out.print("*");
				}
				System.out.print("\r\nB: ");
				for (int i = 0; i<pileB;i++){
					System.out.print("*");
				}
				System.out.print("\r\nC: ");
				for (int i = 0; i<pileC;i++){
					System.out.print("*");
				}
				System.out.println();
				System.out.println();
                System.out.println(player1+", you must take the last remaining counter, so you lose. "+player2+" wins!");
                break;
            }
            if(pileA<=0 && pileB <= 0 && pileC <= 0) {
                if (currentPlayer.equals(player1)){
                    System.out.print("\r\n"+player1+", there are no counters left, so you WIN!");
                }else if(currentPlayer.equals(player2)){
                    System.out.print("\r\n"+player2+", there are no counters left, so you WIN!");
                }
            }
        }
    }
}