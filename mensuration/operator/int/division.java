// division of two number

import java.util.Scanner;
class Division
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();

int divide = num1 / num2;
System.out.print("quosent is : "+divide);
}
}
