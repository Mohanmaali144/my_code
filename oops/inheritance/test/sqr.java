//single
class Square
{
	int  a;
	public void setData(int a)
	{
		this.a=a;
	}
	public int sqr()
	{
		return this.a*this.a;
	}
} 
class Addition extends Square
{
	private int b;
	public void setData(int a, int b)
	{
		this.setData(a);
		this.b=b;
	}
	public int add()
	{
		return this.a+this.b;
	}
}
class Main
{
	public static void main(String []args)
	{
		Addition ob = new Addition();
		ob.setData(5,7);
		System.out.println("Addition = "+ ob.add());
		System.out.println("Square = "+ob.sqr());
	}
}