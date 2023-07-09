import java.util.Scanner;
class EvenSum
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
	public int evenSum()
	{
		int i=1;
		int ans=0;
		int sum=0;
		while(i<=n)
		{		 
			ans = i*2;
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
		EvenSum ob = new EvenSum();
		ob.setData(n);
		System.out.println(ob.evenSum());
	}
}