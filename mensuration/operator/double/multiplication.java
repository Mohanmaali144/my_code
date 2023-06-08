// multiplication of two number

import java.util.Scanner;
class Multiplication
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = sc.nextDouble();

System.out.print("Enter second number: ");
double num2 = sc.nextDouble();

double multi = num1 * num2;
System.out.print("Multiplication is : "+multi);
}
}
