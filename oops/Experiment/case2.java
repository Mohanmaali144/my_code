class Test
{
	public static void  display()
	{
		System.out.println("hello display....");
	}
	public static void main(String [] args)
	{
		
	}
	public static void show()
	{
		System.out.println("hello. show");
	}
	static
	{
		System.out.println("hello static.....");
		Test.display();
		Test.show();
	}
	
}