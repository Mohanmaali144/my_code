import java.util.Scanner;
class Prime
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
	public void isPrime(int n)
	{
		int i=2,sum=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(i==this.n)
			System.out.println("prime");
		else
			System.out.println("Not prime");		
	}
}
class Test
{
	public static void main(String args[])
	{
		Prime ob=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		ob.isPrime(n);
	}
}