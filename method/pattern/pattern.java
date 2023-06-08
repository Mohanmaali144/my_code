

import java.util.Scanner;
class Pattern
{  
	public void sqr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=1; j<=n; j++)
				System.out.print("* ");
			
		System.out.println("");	
		}
	}		
	public void triangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			
		System.out.println("");	
		}
	}	
	public void triangle2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=i; j<=n; j++)
				System.out.print("* ");
			
		System.out.println("");	
		}
	}	
	public void triangle3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=i; j<n; j++)
				System.out.print("  ");	
			
			for(int k=1;k<=i;k++)
				System.out.print("* ");	
			
		System.out.println("");	
		}
	}
	public void triangle4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=1; j<i; j++)
				System.out.print("  ");	
			
			for(int k=i;k<=n;k++)
				System.out.print("* ");	
			
		System.out.println("");	
		}
	}
	public void triangle5()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{ 
			for(int j=1; j<=n; j++)
			{	
				if(j==1 || j==i || i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println("");	
		}
	}
	public void triangle6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1;i<=n; i++)
		{		
			for(int k=i; k<n; k++)
				System.out.print(" ");
			for(int j =1; j<=i*2-1;j++)
					System.out.print("*");
			System.out.println("");
		}	
	}	
	public void triangle7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1;i<=n; i++)
		{		
			for(int j =1; j<=n;j++)
				if(i==j ||(i+j)==n+1)
					System.out.print("*");
				else
					System.out.print(" ");
				
				System.out.println("");
		}	
	}	
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("choice are...");
		System.out.println("press 1 for sqr");
		System.out.println("press 2 for triangle");
		System.out.println("press 3 for triangle2");
		System.out.println("press 4 for triangle3");
		System.out.println("press 5 for triangle4");
		System.out.println("press 6 for triangle5");
		System.out.println("press 7 for triangle6");
		System.out.println("press 8 for triangle7");
		System.out.println("Enter choice..");
		int ch = sc.nextInt();
		Pattern ob = new Pattern();
		switch(ch)
		{
			case 1:
				ob.sqr();
			break;
				
			case 2:
				ob.triangle();
			break;
				
			case 3:
				ob.triangle2();
			break;

			case 4:
				ob.triangle3();
			break;

			case 5:
				ob.triangle4();
			break;
				
			case 6:
				ob.triangle5();
			break;
				
			case 7:
				ob.triangle6();
			break;
				
			case 8:	
				ob.triangle7();
			break;
			default:
				System.out.println("invalid choice...");
		}
	}	
}