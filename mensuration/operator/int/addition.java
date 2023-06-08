// addition of two number

import java.util.Scanner;

class Addition
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter first number: " );
int num1 = sc.nextInt();


System.out.print("Enter second number:" );
int num2 = sc.nextInt();

int addition = num1+num2;

System.out.print("Addition is : "+addition);
}
}
