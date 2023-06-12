/*calculator using Switch case and method________02/06/2023*/

import java.util.Scanner;
class Test
{
		Scanner sc = new Scanner(System.in);
	
		public void add()
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double re = a+b;
			 System.out.println("Addition = "+re);
		}
		public void subtsrection()
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double re = a-b;
			System.out.println("Substraction = "+re);		
		}
		
		public void multiplication()
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
 			double b = sc.nextDouble();
			double re = a*b;
			System.out.println("multiplication = "+re);
		}
		
		public void division()
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double  b = sc.nextDouble();
			double re = a/b;
			System.out.println("Division  = "+re);
		}
		
		public void modulas()
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double re = a%b;
			System.out.println("Modulas  = "+re);
		}
		
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
	Test ob = new Test();
	switch(ch)
	{
		case 1:
			ob.add();
		break;
				
		case 2:		
			ob.subtsrection();
		break;
		
		case 3:
			ob.multiplication();
		break;
		
		case 4:
			ob.division();
		break;	
	
		case 5:
			ob.modulas();
		break;
		default: 
		  System.out.println("invalid choice...");
	}
  }
}