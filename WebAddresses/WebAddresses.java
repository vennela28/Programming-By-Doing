import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
		Scanner fin = new Scanner( addys.openStream() );

		Address uno = new Address();
		uno.street = fin.nextLine();
		uno.city   = fin.nextLine();
		uno.state  = fin.next();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Address dos = new Address();
		dos.street = fin.nextLine();
		dos.city   = fin.nextLine();
		dos.state  = fin.next();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Address tre = new Address();
		tre.street = fin.nextLine();
		tre.city   = fin.nextLine();
		tre.state  = fin.next();
		tre.zip    = fin.nextInt();
		fin.skip("\n");
		
		
		Address re = new Address();
		re.street = fin.nextLine();
		re.city   = fin.nextLine();
		re.state  = fin.next();
		re.zip    = fin.nextInt();
		fin.skip("\n");
		
		Address r = new Address();
		r.street = fin.nextLine();
		r.city   = fin.nextLine();
		r.state  = fin.next();
		r.zip    = fin.nextInt();
		fin.skip("\n");
		fin.close();
		
		System.out.println("1. "+uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println("2. "+dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println("3. "+tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
		System.out.println("4. "+re.street + ", " + re.city + ", " + re.state + "  " + re.zip);
		System.out.println("5. "+r.street + ", " + r.city + ", " + r.state + "  " + r.zip);
	}
}

