 /*check num divisible by 5 and 11 or no___________29/04/2023*/
 
 import java.util.Scanner;

class Divisible
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);


System.out.println("\nEnter a num:" );
int num = sc.nextInt();

switch(num%5)
{
	case 0:
		switch(num%11)
		{
			case 0:
			System.out.println(num+"  is Divisible by 5 and 11" );
			break;
		
			default:
			System.out.println(num+"  is not Divisible by 5 and 11" );
			break;
		}
	break;
	default:
	  System.out.println(num+"  is not Divisible by 5 and 11" );
	
}
}

}