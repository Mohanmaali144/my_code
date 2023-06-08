// division of two number

import java.util.Scanner;
class Division
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = sc.nextDouble();

System.out.print("Enter second number: ");
double num2 = sc.nextDouble();

double divide = num1 / num2;
System.out.print("quosent is : "+divide);
}
}
