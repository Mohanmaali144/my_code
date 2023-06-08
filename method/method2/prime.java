
import java.util.Scanner;
class Prime
{  
	public void isPrime(int x)
	{	
		int i;
		for(i=2; i<x; i++)
			if(x%i==0)
				break;
		if(i==x)
			System.out.println("true");
		else
			System.out.println("false");
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		Prime ob = new Prime();
		ob.isPrime(n);		
	}	
}