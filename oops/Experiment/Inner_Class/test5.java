
class Outer {
	
	private int p = 12;
	
		static class Inner {
			Outer out = new Outer();
			
			void show()
			{
				System.out.println("P = "+out.p);
				
			}
		}
}
class Test {
	
	public static void main(String args[])
	{
		//Outer out = new Outer();
		
		Outer.Inner in = new Outer.Inner();
		//out.display();
		in.show();
	}
}