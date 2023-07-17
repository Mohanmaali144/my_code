import java.util.Scanner;

interface in1 {
	
	 void display();
	
}
interface in2  {
	
	void show();
	
}

class Test implements in1,in2 {
	
	public void display()
	{
		System.out.println("In1  interface");
	} 
	
	public void show()
	{
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
