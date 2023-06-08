/* check triangle is Equilateral,Isosceles,Scalene.*/
import java.util.Scanner;
class TriangleSecond
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
	
	if(total!=180)
	{
		System.out.println("invalid triangle");	
	}
	else if(side1==side2 && side2==side3)
	{
		System.out.println("Equilateral triangle");
	}
	else if((side1==side2) || (side1==side3)||(side2==side3))
	{
		System.out.println("Isosceles triangle");
	}
	else
	{
		System.out.println("Scalene triangle");
	}
}
}
	