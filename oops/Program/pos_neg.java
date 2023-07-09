import java.util.Scanner;
class Number
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
	
	public void posNeg()
	{		
		if(this.n==0)
			System.out.println("Zero");
		else if(this.n>0)
			System.out.println("positive");
		else 
			System.out.println("negative");
	}
}
class Test
{
	public static void main(String args[])
	{
		Number ob=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		ob.posNeg();
	}

}