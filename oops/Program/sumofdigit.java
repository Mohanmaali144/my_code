import java.util.Scanner;
class Add
{
	int n;
	public void setData(int n)
	{
		this.n=n;	
	}
	public int getData(int n)
	{
		return this.n;	
	}
	public int sum(int n)
	{
		int r=0,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
}
class Test
{
	public static void main(String args[])
	{
		Add ob=new Add();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		ob.setData(n);
		int res=ob.sum(n);
		System.out.println("sum="+res);
	}
}