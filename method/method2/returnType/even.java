/*Write a method named isEven that accepts an int argument.
 The method should return true if the argument is even, 
 or false otherwise. */
import java.util.Scanner;
class Even
{  
	public boolean isEven(int x)
	{	
		if(x%2==0)
		return true;
		else
			return false;
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();	
		System.out.println(new Even().isEven(n));		
	}	
}