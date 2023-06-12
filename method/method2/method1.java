// no return with argument

import java.util.Scanner;
class Test
{  
	public void display(Test k)
	{
		int a = 9;
		System.out.println("hello display....");
		System.out.println("A = "+a);
		k.show();
	}	
	public void show()
	{	
		System.out.println("hello show....");			
	}	
	public static void main(String[]args)
	{
		Test ob = new Test();
		ob.display(ob);	
	}	
}