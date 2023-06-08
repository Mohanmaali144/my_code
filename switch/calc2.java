/*calculator using Switch case________29/04/2023*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);

    double a,b,re;
	System.out.println("choice are:  ");
	System.out.println("press 1  for Addition");
	System.out.println("press 2  for substraction");
	System.out.println("press 3  for Multiplication");
	System.out.println("press 4  for Division");
	System.out.println("press 5  for modulas");
	
	System.out.println("Enter your choice:");
	int ch = sc.nextInt();
	
	switch(ch)
	{
		case 1:
		System.out.println("Enter two numbers: ");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
	     re = a+b;
		System.out.println("Addition = "+re);
		break;
				
		case 2:		
		System.out.println("Enter two numbers: ");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
	     re = a-b;
		System.out.println("Substraction = "+re);
		break;
		
		case 3:
		System.out.println("Enter two numbers: ");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		 re = a*b;
		System.out.println("multiplication= "+re);
		break;
		
		case 4:
		
		 System.out.println("Enter two numbers: ");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		 re = a/b;
		 System.out.println("Division  = "+re);
		break;	
	
		case 5:
		System.out.println("Enter two numbers: ");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		 re = a%b;
		System.out.println("Modulas  = "+re);
		break;
		default: 
		  System.out.println("invalid choice...");
	}
  }
}