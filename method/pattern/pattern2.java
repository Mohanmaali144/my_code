
import java.util.Scanner;
class Pattern
{  
	public void triangle()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entr a range");
		int n = sc.nextInt();
		int k=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++,k++)
				System.out.print((k+" "));
			
			System.out.println("");
		}
	}		
	
	
	public void triangle2()
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("Entr a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			
			System.out.println("");
		}
	}	
	
	public void triangle3()
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("Entr a range");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			
			System.out.println("");
		}
	}	
	
	public void triangle4()
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("Entr a range");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{	if(i!=j||j==n||i==n)
					System.out.print(" ");
				else
					System.out.print("*");
			}	
			System.out.println("");
		}
	}	
	public static void main(String[]args)
	{	
		Pattern ob = new Pattern();
		//ob.triangle();
		//ob.triangle2();
		//ob.triangle3();
		ob.triangle4();
	}
}