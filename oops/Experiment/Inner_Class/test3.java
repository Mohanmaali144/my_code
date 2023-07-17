


class Outer {
	
	private int p = 10;
	void display()
	{
		class Inner {
			
			void show()
			{
				System.out.println("P = "+p);
				
			}
		}
		Inner ob = new Inner();
		ob.show();
	}
	
}
class Test {
	
	public static void main(String args[])
	{
		Outer out = new Outer();
		out.display();
	}
}