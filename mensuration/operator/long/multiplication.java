// multiplication of two number

import java.util.Scanner;
class Multiplication
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
long num1 = sc.nextLong();

System.out.print("Enter second number: ");
long num2 = sc.nextLong();

long multi = num1 * num2;
System.out.print("Multiplication is : "+multi);
}
}
