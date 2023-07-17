
class Outer 
{
	
	static int i=10;
	public void display()
	{
		System.out.println("Hello display....");
		
	}	
	static class Inner
	{
		//Outer.Inner ob= new Outer.Inner();
		Outer ob= new Outer();
		public void show()
		{
			System.out.println("Hello show....");
			System.out.println(i);		
		}
	
		//Outer ob= new Outer();
		//ob.display();	
		
	}	
	public static void main(String []args)
	{
		Inner ob = new Inner();
		ob.show();
	}
}


/*class Main
{
	public static void main(String []args)
	{
		// Outer.Inner ob = new Outer.Inner();   : correct way
		// ob.show();  : correct way
		
		// Outer ob = new Outer(); : correct way
		// ob.display(); : correct way
		
		
		// Outer ob = new Outer();  : wrong way
		// ob.show();   : wrong way
			
		//Inner ob = new Inner();  :  wrong way
		// ob.show(); : wrong way
		
		Outer ob = new Outer();
		ob.display();
	}
} */