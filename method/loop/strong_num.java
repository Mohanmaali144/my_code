// strong num 

import java.util.Scanner;
class Strong
{  
	public void check_strong()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum=0,temp=n;
		
		while(n>0)
		{
			int re = n%10;
			int fact=1;
			for(int i=1;i<=re; i++)
				fact = fact*i;

			sum+=fact;
			n/=10;
		}
		if(temp==sum)
			System.out.println(temp+ " is Strong number");
		else
			System.out.println(temp+ " is not Strong number");
	}	
	public static void main(String[]args)
	{
		Strong ob = new Strong();
		ob.check_strong();	
	}	
}