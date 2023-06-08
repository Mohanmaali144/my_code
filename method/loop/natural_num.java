
import java.util.Scanner;

class NaturalNum
{
	
	public void natural()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int n = sc.nextInt();
		int i =1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void main(String[]args)
	{
		NaturalNum ob = new NaturalNum();	
		ob.natural();

	}	
}