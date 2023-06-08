
import java.util.Scanner;

class Greater
{
	
	public void greater_num()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();
		if(num1>num2)
			System.out.println( "greater number is  "+num1);	   
		else if(num2>num1)
			System.out.println( "greater number is  "+num2);
		else
			System.out.println( "both are equal");
	}
	
	
	public static void main(String[]args)
	{
		Greater ob = new Greater();	
		ob.greater_num();

	}
	
}