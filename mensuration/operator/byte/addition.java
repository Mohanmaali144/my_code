// addition of two number

import java.util.Scanner;

class Addition
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter first number: " );
byte num1 = sc.nextByte();


System.out.print("Enter second number:" );
byte num2 = sc.nextByte();

 byte ans = (byte) (num1+num2);


System.out.print("Addition is : "+ans);
}
}
