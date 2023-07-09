//perfact number
import java.util.Scanner;
class Perfect
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		return this.n;
	}
	public void isPerfect()
	{
		int i=1,sum=0;
		while(i<this.n)
		{
			if(this.n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==this.n)
			System.out.println("perfect");
		else
			System.out.println("Not perfect");
	}
	
	public void isPerfect(int n)
	{
		int i=1,sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
			System.out.println("perfect");
		else
			System.out.println("Not perfect");
	}
}
class Test
{
	public static void main(String args[])
	{
		Perfect ob=new Perfect();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		//ob.setData(n);
		ob.isPerfect();
	}
}