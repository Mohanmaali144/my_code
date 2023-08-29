import java.util.Scanner;

class Main {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "kamal";
		
		try{
			int a=Integer.parseInt(s);
		}
		catch( NumberFormatException ref)
		{
			System.out.println(ref.getMessage());
			System.out.println(ref.getClass());
		}
		System.out.println("||  continue  ||");
	}

}