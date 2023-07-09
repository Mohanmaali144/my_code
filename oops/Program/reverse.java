import java.util.Scanner;
class Rev
{
	int n;
	public void setData(int n)
	{
		this.n=n;		
	}
	public int reverse()
	{
		int r=0,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		return s;
	}
}
class Test
{
	public static void main(String args[])
	{
		Rev ob=new Rev();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		int res=ob.reverse();
		System.out.println("reverse="+res);
	}
}