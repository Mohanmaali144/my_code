/*cylinder*/

import java.util.Scanner;

class Cylinder
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Choice are:" );

System.out.println("\npress 1 for Area of cylinder" );
System.out.println("press 2 for Base area of cylinder" );
System.out.println("press 3 for height of cylinder" );
System.out.println("press 4 for volume of cylinder" );

System.out.println("\nEnter choice:" );
int ch = sc.nextInt();

  double area,r,h;
   
   switch(ch)
   {
	   case 1:
	        System.out.println("Enter radius: " );
			r = sc.nextDouble();
			area = 2*3.14f*r+2*3.14f*(r*r);
			System.out.println("Area of cylinder : "+area);
		break;
			
		case 2:	
			System.out.println("Enter radius: " );
			r = sc.nextDouble();
			area = 3.14f*(r*r);
			System.out.println("Base Area of cylinder : "+area);
		break;
		
		case 3:
		    
			System.out.print("Enter radius: " );
			r = sc.nextDouble();
			System.out.print("Enter area: " );
			area = sc.nextDouble();
			h = area/(2*3.14f*r)-r;	
			System.out.println("Height of cylinder : "+h);
		break;
		
		case 4:
			System.out.println("Enter Radius: ");
			r = sc.nextDouble();

			System.out.println("Enter Height: ");
			h = sc.nextDouble();
			double v=3.14f*(r*r)*h;
			System.out.println("volume of cylinder : "+v);
			break;
		default	:
		   System.out.println("Invalid choice...!! ");
   }
 
}
}