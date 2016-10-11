import java.util.*;
import java.io.*;
public class HighScore{
	public static void main(String[] args) throws IOException{
	Scanner keyboard = new Scanner(System.in);
	File score = new File("score.txt");
	FileWriter fw = new FileWriter(score);
	PrintWriter pw = new PrintWriter(fw);
	System.out.println("You got a high score!");
	System.out.println();
	System.out.print("Please enter your name: ");
	String name = keyboard.next();
	pw.println(name);
	System.out.print("Please enter your score: ");
	int num = keyboard.nextInt();
	pw.println(num);
	System.out.println("Data stored into score.txt.");
	pw.close();
	}
}