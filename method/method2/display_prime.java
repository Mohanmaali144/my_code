// write main method that displays n prime numbers 
import java.util.Scanner;
class Prime
{  
	public void displayPrime(int x)
	{	
		int i,count=0;
		for(i=1; ; i++)
		{	
			int j;
			for(j=2; j<i; j++)
				if(i%j==0)
					break;
			if(i==j)
			{	
				count++;
				System.out.println(i);
			}
			if(count==x)
				 break;
		}
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		Prime ob = new Prime();
		ob.displayPrime(n);		
	}	
}