
class Test {
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int c;
		
		try 
		{
			c = a/0;
		}
		catch (ArithmeticException ref)
		{
			//System.out.println(ref.getMessage());
			//System.out.println(ref.getClass());
			//System.out.println(ref.printStackTrack());
			System.out.println("the value of b never be Zero");
		}
		System.out.println("Continuee");
		
		
		
		
	}
}