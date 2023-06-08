import java.util.Scanner;
class N_Prime
{  
	public void print_prime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i,count=0;
		
		for(i=1; ; i++)
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
			if(count==n)
				break;
		}	
	}	
	public static void main(String[]args)
	{
		N_Prime ob = new N_Prime();
		ob.print_prime();	
	}	
}