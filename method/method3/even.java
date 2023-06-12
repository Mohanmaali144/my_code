// 12/06/2023
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