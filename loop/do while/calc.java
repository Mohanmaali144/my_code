/*calculator________09/05/2023*/

import java.util.Scanner;
class Calc
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);

    double a,b,re,ch2;
	do{
	System.out.println("\nchoice are:  ");
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
		System.out.println("Substraction = "+re);
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
	 System.out.println("\n\tif you want Exit then press E\n\totherwise press any key");
	 ch2 = sc.next().charAt(0);
	}while(ch2!='E');
	
  }
}