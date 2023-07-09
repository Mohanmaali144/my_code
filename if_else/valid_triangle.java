/* check triangle is valid or not.*/
import java.util.Scanner;
class Triangle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first side ");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter second side ");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter third side ");
		double side3 = sc.nextDouble();	
		
		double total = side1 + side2 +side3;		
		if(total==180)
		{
			System.out.println("valid triangle");		
		}
		else
		{
			System.out.println("invalid triangle");
		}
	}
}
	