import java.util.Scanner;
class Fact
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
	
	public int factorial()
	{
		int fact=1;
		for(int i=1;i<=this.n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class Test
{
	public static void main(String args[])
	{
		Fact ob=new Fact();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		int res=ob.factorial();
		System.out.println("Factorial="+res);
	}

}