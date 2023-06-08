import java.util.Scanner;
class Prime
{  
	public void print_prime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter a range");
		int n2 = sc.nextInt();
		int i,count=0;
		
		for(i=n1; i<=n2 ; i++)
		{	
			int j;	
			for(j=2; j<i; j++)
				if(i%j==0)
					 break;	
			if(j==i)
			{	
				count++;
				System.out.println(i);
			}
		}	
	}	
	public static void main(String[]args)
	{
		Prime ob = new Prime();
		ob.print_prime();	
	}	
}