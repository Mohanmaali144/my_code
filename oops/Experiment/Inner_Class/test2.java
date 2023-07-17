
class Outer 
{
	
	static int i=20;
	public void display()
	{
		System.out.println("Hello display....");
		
	}	
	 class Inner
	{
		Outer ob= new Outer();
		public void show()
		{
			System.out.println("Hello show....");
			System.out.println(i);		
		}
	
		//Outer ob= new Outer();
		//ob.display();	
		
	}	
}


class Main
{
	public static void main(String []args)
	{
		Outer ob = new Outer();
		
		Outer.Inner in = ob.new Inner();
		ob.display();
		in.show();
	}
} 