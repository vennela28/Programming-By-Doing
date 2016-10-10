import java.util.*;
public class FortuneCookie{
	public static void main(String[] args){
	Random r = new Random();
	int x = 1+r.nextInt(6);
	int y1 = 1+r.nextInt(54);
	int y2 = 1+r.nextInt(54);
	int y3 = 1+r.nextInt(54);
	int y4 = 1+r.nextInt(54);
	int y5 = 1+r.nextInt(54);
	int y6 = 1+r.nextInt(54);
	System.out.print("Fortune cookie says: ");
	if(x==1){
		System.out.println("\"You will win and succeed.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}else if(x==2){
		System.out.println("\"You dont lose hope.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}else if(x==3){
		System.out.println("\"You will make it to Google this year.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}else if(x==4){
		System.out.println("\"You will be happy.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}else if(x==5){
		System.out.println("\"You will be rich soon.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}else if(x==6){
		System.out.println("\"You will be popular soon.\"");
		System.out.print("\t"+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6);
	}
	}
}