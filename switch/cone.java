/*cone*/

import java.util.Scanner;

class Cone
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Choice are:" );

System.out.println("\npress 1 for Area of cone" );
System.out.println("press 2 for Base area of con" );
System.out.println("press 3 for Volume of cone" );

System.out.println("\nEnter choice:" );
int ch = sc.nextInt();

  double area,r,h;
 switch(ch)
 {
	case 1: 
		System.out.println("Enter redius of cone: " );
		r = sc.nextDouble();

		System.out.println("Enter Hgiht cone: " );
		h = sc.nextDouble();
		area = 3.14f *r*(r+r+h);
		System.out.println("Redius of circle : "+area); 
	 break;
	 
	case 2:
		System.out.println("Enter redius of cone: " );
         r = sc.nextDouble();
         area = 3.14f *(r*r);
         System.out.println("Base area of cone : "+area);
	break;

   case 3:     
         System.out.println("Enter Radius: ");
         r = sc.nextDouble();
        System.out.println("Enter Height: ");
        h = sc.nextDouble();
      double  volume = (1/3) *3.14f * (r*r)*h ;
		System.out.println("vlume of cone : "+volume);
	break;
	
	default :
	    System.out.println("Invalid choice...");
		
 }

}
}
