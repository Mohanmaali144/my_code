
class Outer {
	
	private static int p = 180;
	void display()
	{
		 class Inner {
			
			void show()
			{
				System.out.println("P = "+p);
				double t= 3456/5;
				System.out.println("P = "+t);
				
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