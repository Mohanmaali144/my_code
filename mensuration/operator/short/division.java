// addition of two number

import java.util.Scanner;

class Division
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter first number: " );
short num1 = sc.nextShort();


System.out.print("Enter second number:" );
Short num2 = sc.nextShort();

short ans = (short) (num1/num2);
 

System.out.print("answer is: "+ans);
}
}
