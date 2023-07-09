import java.util.Scanner;
class Pascal
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public void getData()
	{
		return this.n;
	}
	
	public void pTriangle()
	{
		for(int i=0;i<n;i++)
		{
		    for(int j=1;j<n-i;j++)
			{
			    System.out.print(" ");
			}
			int num=1;
			for(int k=0;k<=i;k++)
			{
			    System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
		 System.out.println();
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Pascal ob=new Pascal();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		ob.pTriangle();
	}
}