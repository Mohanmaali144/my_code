import java.util.Scanner;
class Prime
{  
	public void check_prime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i;
		for(i=2; i<n; i++)
			if(n%i==0)
				 break;	
		if(i==n)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime number");
	}	
	public static void main(String[]args)
	{
		Prime ob = new Prime();
		ob.check_prime();	
	}	
}