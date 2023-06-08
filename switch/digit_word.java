/*INPUT DIGIT AND PRINT IN  WORD*/

import java.util.Scanner;

class Digit
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);


System.out.println("\nEnter a DIGIT:" );
int num = sc.nextInt();


switch(num)
{
	case 1:
	    System.out.println(num+" :  ONE" );
	break;
	
	case 2:
	    System.out.println(num+" :  TWO" );
	break;
	
	case 3:
	    System.out.println(num+" :  THREE" );
	break;
	
	case 4:
	    System.out.println(num+" :  FOUR" );
	break;
	
	case 5:
	    System.out.println(num+" :  FIVE" );
	break;
	
	case 6:
	    System.out.println(num+" :  SIX" );
	break;	
	
	case 7:
	    System.out.println(num+" :  SEVEN" );
	break;	
	
	case 8:
	    System.out.println(num+" :  EIGHT" );
	break;
	
	case 9:
	    System.out.println(num+" :  NINE" );
	break;
	
	case 0:
	    System.out.println(num+" :  ZERO" );
	break;
	
	default :
    	System.out.println("Not a DIGIT" );
	
}


}
}