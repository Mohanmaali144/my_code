/* circle  29/04/2023*/

import java.util.Scanner;

class Circle
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Choice are:" );

		System.out.println("\npress 1 for Area of circle" );
		System.out.println("press 2 for cercumeferens of circle" );
		System.out.println("press 3 for diameter of circle" );
		System.out.println("press 4 for  Radius of circle" );

		System.out.println("\nEnter choice:" );
		int ch = sc.nextInt();

		double area,r,c;

		switch(ch)
		{
			case 1:	
				System.out.println("Enter redius: " );
				 r = sc.nextInt();
				 area = 3.14f*(r*r);
				System.out.print("Area of circle : "+area);
				break;
			
			case 2: 
				System.out.println("Enter Radius: ");
				r = sc.nextFloat();
				c=2*(3.14)*r;
				System.out.println("Circuference of circle = "+c);
				break;
			
			case 3:
				System.out.println("Enter redius: " );
				r = sc.nextInt();
				area = r*2;
				System.out.println("Area of circle : "+area);
				break;
				
			case 4:	
				System.out.println("Enter Circumference of circle: " );
				c = sc.nextInt();
				r = c/(2*3.14f);
				System.out.print("Redius of circle : "+r);	
			break;
			
			default :
			   System.out.print("Invalid choice");
		}

	}
}