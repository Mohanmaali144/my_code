import java.util.Scanner;
class Fact
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");	
		int n = sc.nextInt();
		long a[]=new long[n], fact=1;
		int i;
			
		for(i=1; i<=n; i++)
		{
			fact = fact*i;
			a[i-1]= fact;
		}
		
			
		for(i=0; i<n; i++)
			System.out.println(a[i]);
		
	}	
}	
		