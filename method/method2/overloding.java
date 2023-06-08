// overloding

import java.util.Scanner;
class Test
{  
	public void add(int a)
	{
		int c=a+2;
		System.out.println("add1 = "+c);		
	}	
	
	public void add(float f)
	{	
		float b=f+2;
		System.out.println("add2 = "+b);			
	}	
	public static void main(String[]args)
	{
		Test ob = new Test();
		ob.add(23);
		ob.add(5.9f);
	}	
}