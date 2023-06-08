/*Write a method named isEven that accepts an int argument.
 The method should print true if the argument is even, 
 or false otherwise. Also write a program to test your method.*/
import java.util.Scanner;
class Even
{  
	public void isEven(int x)
	{	
		if(x%2==0)
		System.out.println("true");	
		else
			System.out.println("false");
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();	
		Even ob = new Even();
		ob.isEven(n);		
	}	
}