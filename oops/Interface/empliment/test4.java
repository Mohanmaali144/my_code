import java.util.Scanner;
public abstract interface Account {
	
	void display();	
}

class Test implements Account {
	
	public static void main(String []args)
	{
		Test ob = new Test();
		ob.display();
	}
	public void display()
	{
		System.out.println("display........");
	}
	
}