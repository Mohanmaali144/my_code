import java.util.Scanner;
class Pattern
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public void starP1()
	{
		int i=1;			
		while(i<=n)
		{    
			int j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void starP3()
	{
		int i,j;
		int k=n*2;
		for(i=1; i<=k; i++)
		{
			if(i<=5)
			{
				for(j=1; j<=i; j++)
					System.out.print("* ");
			}
			else
			{			
				for(j=k; j>i; j--)
					System.out.print("* ");
			}
			System.out.println("");
		}

	}
	public void starP2()
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
				System.out.print("  ");
			for(int k=1; k<=i; k++)
				System.out.print(" *  ");
		
			System.out.println("");
		}
	}
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a range:");
		int n = sc.nextInt();
		Pattern ob = new Pattern();
		ob.setData(n);
		//ob.starP1();
		//ob.starP2();
		ob.starP3();
	}
}