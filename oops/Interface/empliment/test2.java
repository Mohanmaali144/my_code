// static method can't call by the object of other class 
// final method not allow in interface

import java.util.Scanner;
interface in1 {
	
	void display();
	int a=6;
}
interface in2  {
	
	public void show();
	
}

class Test implements in1,in2 {
	
	public void display()
	{
		System.out.println("In1  interface");
	} 
	public void display()
	{
		System.out.println("In1  interface");
	} 
	
	
	public void show()
	{
		System.out.println(a);
		System.out.println("In2  interface....");
	}
}
class Main {
	
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.display();
		ob.show();
	}
}
