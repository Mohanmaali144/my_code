/*Input month number and print day and month name   _________29/04/2023*/

import java.util.Scanner;

class Month
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);


System.out.println("\nEnter a month number:" );
int num = sc.nextInt();


 switch(num)
 {
	case 1:
	  System.out.println("JANUARY: 31 DAY" );
	 break;
	 
	case 2:
	  System.out.println("FABUARY: 28 OR 29 DAY" );
	 break; 
	 
	case 3:
	  System.out.println("MARCH: 31 DAY" );
	 break; 
	 
	 case 4:
	  System.out.println("APRIL: 30  DAY" );
	 break;
	 
	 case 5:
	  System.out.println("MAY: 31  DAY");
	 break;
	 
	 case 6:
	  System.out.println("JUNE: 30 DAY");
	 break;
	 
	 case 7:
	  System.out.println("JULY: 31 DAY");
	 break;
	 
	 case 8:
	  System.out.println("AUGUST: 31 DAY");
	 break;
	 
	 case 9:
	  System.out.println("SEPTEMBER: 30 DAY" );
	 break;
	 
	 case 10:
	  System.out.println("OCTOBER: 31 DAY" );
	 break;
	 
	  
	 case 11:
	  System.out.println("NOVEMBER: 30" );
	 break;
	 
	  
	 case 12:
	  System.out.println("DECEMBER: 31" );
	 break;
	 
	 default:
	    System.out.println("invalid DAY...!!!" );
 }
 }
 }