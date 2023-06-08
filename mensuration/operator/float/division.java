// division of two number

import java.util.Scanner;
class Division
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
float num1 = sc.nextFloat();

System.out.print("Enter second number: ");
float num2 = sc.nextFloat();

float divide = num1 / num2;
System.out.print("quosent is : "+divide);
}
}
