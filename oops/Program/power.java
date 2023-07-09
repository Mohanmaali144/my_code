import java.util.Scanner;
class Pow
{
	int a,b;
	public void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getData()
	{
		return this.a
	}
	public int power()
	{
		int p=1;
		for(int i=1;i<=b;i++)
		{
			p=p*a;
		}
		return p;
	}
}
class Test
{
	public static void main(String args[])
	{
		Pow ob=new Pow();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");	
		int a=sc.nextInt();
		System.out.println("Enter base");
		int b=sc.nextInt();		
		ob.setData(a,b);
		int res=ob.power();
		System.out.println("Power="+res);
	}
}