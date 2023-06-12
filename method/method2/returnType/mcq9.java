// Error compile time

class Test
{
	public static void main(String []arg)
	{
		Test ob = new Test ();
		System.out.println(ob.show(3,5));
		System.out.println(ob.show(3.4,5.4));	
	}
	 public int show(int x ,int y)
	 {
		 return x+y;
	 }
}