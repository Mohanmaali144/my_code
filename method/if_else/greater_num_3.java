
import java.util.Scanner;

class Greater_3
{
	
	public void greater()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = sc.nextInt();		
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter a third number: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println("Greater num is  "+num1);
		
		else if(num2>num1 && num2>num3)
			System.out.println("Greater num is  "+num2);
		
		else if(num3>num2 && num3>num1)
			System.out.println("Greater num is  "+num3);
		else if(num1 == num2 || num1 == num3 || num3 == num2)
			System.out.println("any two are Equal");
		
		else
			System.out.println("all Equal");
		
	}
	
	public static void main(String[]args)
	{
		Greater_3 ob = new Greater_3();	
		ob.greater();

	}
	
}