class First
{
	public static void  display()
	{
		System.out.println("hello display....");
	}
	
	public static void show()
	{
		System.out.println("hello. show");
	}
	static 
	{
		System.out.println("hello Static.... ");
		First.display();
		First.show();
	}	
}
class Test 
{
	public static void main(String []args)
	{
		System.out.println("Hello main.....");
	}
}