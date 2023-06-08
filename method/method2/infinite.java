// infinite
import java.util.Scanner;
class Test
{  
	public void display()
	{
		int a = 9;
		System.out.println("hello display....");
		System.out.println("A = "+a);
		//k.show();
		//k.show(k);
		this.show();
	}	
	
	public void show()
	{		
		System.out.println("hello show....");
		// with creat object
		
		/*Test ob = new Test();	
		ob.display(ob);	*/
		
		// with pass a argument
		//m.display(m);
		this.display();
	}	
	public static void main(String[]args)
	{
		Test ob = new Test();
		ob.display();
		
	}	
}