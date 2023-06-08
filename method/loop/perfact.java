import java.util.Scanner;
class Perfact
{  
	public void check_perfact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1; i<n/2; i++)	
		{
			if(n%i==0)
				sum+=i;	
		}	
			if(sum==n)
				System.out.println(n+" is perfact number");
			
			else
				System.out.println(n+" is not perfact number");
	}	
	public static void main(String[]args)
	{
		Perfact ob = new Perfact();
		ob.check_perfact();	
	}	
}