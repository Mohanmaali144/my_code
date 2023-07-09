import java.util.Scanner;
class Ascii
{
	public void printAscii()
	{
		int i;	
		for(i=1; i<=127; i++)
		{	
			System.out.println(" "+i+" = "+(char)i);
		}
	}
}
class Test 
{
	public static void main(String []args)
	{
		Ascii ob = new Ascii();
		ob.printAscii();	
	}
}