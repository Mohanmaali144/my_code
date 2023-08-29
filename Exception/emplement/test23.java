
class Test{

	int a,b;
	
	public Test (){}
	public Test(int a,int b)
	{
		this.a=a;
		this.b= b;
	}
	
	public void div()throws ArithmeticException 
	{
			int c=a/b;
			System.out.println(c);
	} 
}
class Main {
	
	public static void main(String args[])
	{
		
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			Test ob = new Test(a,b);
			ob.div();
		}	
		catch(ArithmeticException ref)
		{
			System.out.println("Not found");
		}
		
	}
}