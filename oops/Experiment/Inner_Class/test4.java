


class Outer {
	
	private int p = 13;
	
		class Inner {
			
			private void show()
			{
				System.out.println("P = "+p);
				
			}
		}
}
class Test {
	
	public static void main(String args[])
	{
		Outer out = new Outer();
		
		Outer.Inner in = out.new Inner();
		//out.display();
		in.show();
	}
}