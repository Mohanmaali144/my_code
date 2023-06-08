// no return without argument

import java.util.Scanner;
class Test
{  
	public void display()
	{
		System.out.println("hello display....");
		this.show();
	}	
	
	public void show()
	{	
		System.out.println("hello show....");			
	}	
	public static void main(String[]args)
	{
		Test ob = new Test();
		ob.display();
	}	
}