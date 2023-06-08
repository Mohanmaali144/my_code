
import java.util.Scanner;
class Sum
{  
	public void sum(int x,int y)
	{	
		System.out.println("Sum = "+(x+y));	
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		Sum ob = new Sum();
		ob.sum(a,b);		
	}	
}