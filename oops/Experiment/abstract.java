import java.util.Scanner;
abstract class Abs
{
	abstract void print();	
}
class Child extends Abs
{
	 void print()
	{
		System.out.println("hello...child");
	}	
}
class Child2 extends Abs
{
	 void print()
	{
		System.out.println("hello...child2 ");
	}
}
class Test 
{
	public static void main(String[]args)
	{
		Abs ob = new Abs();
		ob.print();
		//ob.
	}
}