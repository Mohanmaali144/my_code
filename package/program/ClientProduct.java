import java.util.Scanner;
import companycustomer.Customer;
class ClientProduct {

	public static void main (String args[])
	{
		Customer ob = new Customer();
		ob.setCName("HP");
		ob.setOwner("Bill Hewlett David Packard");
		ob.setEmployee(200);
		ob.setPName("Leptop");
		ob.setmDate(2022);
		ob.setexDate(2050);
		ob.setName("Nitin");
		ob.setAddress("Indore");
		ob.setGender("male");
		ob.setPhonNum("1234567890");
		
		System.out.println(ob.getCName());
		System.out.println(ob.getOwner());
		System.out.println(ob.getEmployee());
		System.out.println(ob.getPName());
		System.out.println(ob.getmDate());
		System.out.println(ob.getexDate());
		System.out.println(ob.getName());
		System.out.println(ob.getAddress());
		System.out.println(ob.getGender());
		System.out.println(ob.getPhonNum());
		
	}
}