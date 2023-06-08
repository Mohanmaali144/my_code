/*Rectangle..  _________29/04/2023*/

import java.util.Scanner;

class Rectangle
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Choice are:" );

System.out.println("\npress 1 for Area of Rectangle" );
System.out.println("press 2 for perimeter of rectangle " );
System.out.println("press 3 for volume of cylinder" );

System.out.println("\nEnter choice:" );
int ch = sc.nextInt();

  double area,w,l,h;

 switch(ch)
 {
	case 1:
	   System.out.print("Enter lenth: " );
		l = sc.nextDouble();
		System.out.println("Enter width: ");
		w = sc.nextDouble();
		area = l*w;
		System.out.println("Area of rectangle : "+area);
	 break;
	 
	 case 2:
	     System.out.println("Enter lenth: " );
		l= sc.nextDouble();
		System.out.println("Enter width: ");
		w = sc.nextDouble();
		double p = 2*(l+w);
		System.out.print("perimeter of rectangle : "+p);
		break;
		
	case 3:	
	     System.out.println("Enter Lenth of rectengal");
		l = sc.nextDouble();
		System.out.println("Enter with of rectengal");
		w = sc.nextDouble();
		System.out.println("Enter hight of rectengal");
		h = sc.nextDouble();
		double	v=l*w*h;
		System.out.println("volume of rectangle:  "+v);
		break;
		
	default :
	        System.out.println("Invalid choice....");
 }
  
}
} 