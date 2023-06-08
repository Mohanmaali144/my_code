
import java.util.Scanner;
class Prime
{  
	public boolean isPrime(int x)
	{	
		int i;
		for(i=2; i<x; i++)
			if(x%i==0)
				break;		
		if(i==x)
			return true;
		else
			return false;
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		System.out.println( new Prime().isPrime(n));	
	}	
}