import java.util.Scanner;
class OddSum
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
	public int oddSum()
	{
		int i=1;
		int ans=0;
		int sum=0;
		while(i<=n)
		{		 
			ans = i*2-1;
			sum=sum+ans;			 
		 i++;
		}
		return sum;
	}
}
class Test
{
	public static void main(String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		OddSum ob = new OddSum();
		ob.setData(n);
		System.out.println(ob.oddSum());
	}
}