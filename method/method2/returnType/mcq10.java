// Error compile time

class Test
{
	public static void main(String []arg)
	{
		Test ob = new Test ();
		System.out.println(ob.show(3,5));
		System.out.println(ob.show(3.4,5.4));	
	}
	 public var show(var x ,var y)
	 {
		 return x+y;
	 }
}