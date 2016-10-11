import java.io.*;
public class LetterRevisited{
	public static void main(String args[]) throws IOException{
	File letter = new File("letter.txt");
	FileWriter fw =new FileWriter(letter);
	PrintWriter pw = new PrintWriter(fw);
		pw.println("+--------------------------------------------------------------+");
		pw.println("|                                                         #### |");
		pw.println("|                                                         #### |");
		pw.println("|                                                         #### |");
		pw.println("|                                                              |");
		pw.println("|                             Sunnam Vennela                   |");
		pw.println("|                             1401 Red Hawk Circle, Apt-P204   |");
		pw.println("|                             Fremont, CA-94588                |");
		pw.println("|                                                              |");
		pw.println("+--------------------------------------------------------------+");
		pw.close();
	}
}