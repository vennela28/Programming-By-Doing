import java.util.Calendar;
public class StillUsingVariables{
	public static void main(String[] args){
		String name="Vennela Sunnam";
		int time = Calendar.getInstance().get(Calendar.YEAR)-2;
		System.out.println("My name is "+name+" and I'll graduate in "+time+".");
	}

}