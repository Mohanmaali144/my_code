 /*check number is even or odd*/
 
 import java.util.Scanner;

class EvenOdd
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);


System.out.println("\nEnter a num:" );
int num = sc.nextInt();

switch(num%2)
{
	case 0:
	  System.out.println(num+"  Even number" );
	break;
	
	case 1:
	  System.out.println(num+" Odd number" );
	break;
	
	default: 
	    System.out.println("invalid number...." );
}
}

}