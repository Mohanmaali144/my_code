/*calculator using if else________29/04/2023*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);

    
	System.out.println("choice are:  ");
	System.out.println("press 1  for Addition");
	System.out.println("press 2  for substraction");
	System.out.println("press 3  for Multiplication");
	System.out.println("press 4  for Division");
	System.out.println("press 5  for modulas");
	
	System.out.println("Enter your choice:");
	int ch = sc.nextInt();
	
		if(ch==1)
		{
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double re = a+b;
		System.out.println("Addition = "+re);
		
		}
		else if(ch==2)
		{
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double re = a-b;
		System.out.println("Substraction = "+re);
		
		}
		else if(ch==3)
		{
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double re = a*b;
		System.out.println("Substraction = "+re);
		
		}
		else if(ch==4)
		{
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double re = a/b;
		System.out.println("Division  = "+re);
				
		}
		else if(ch==5)
		{
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double re = a%b;
		System.out.println("Modulas  = "+re);
		}
		else
		{
			System.out.println("Invalid choice  !!!...");
		}
  }
}