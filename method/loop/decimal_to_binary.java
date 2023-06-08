
import java.util.Scanner;
class Decimal
{  
	public void convert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int binary=0, n = sc.nextInt();
		int i=1;
		while(n>0)
		{	
			int re = n%2;
			binary+=i*re;
			n=n/2;
			i*=10;
		}	
		System.out.println(binary);
	}	
	public static void main(String[]args)
	{
		Decimal ob = new Decimal();
		ob.convert();	
	}	
}