/*Factorial  */
import java.util.Scanner;
class Factorial
{  
	public int fact(int x)
	{		
		int fact=1,i;
		for(i=1; i<=x; i++)
			fact=fact*i;
		return fact;
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		System.out.println((new Factorial().fact(n)));
	}
}
