// multiplication of two number

import java.util.Scanner;
class Multiplication
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();

int multi = num1 * num2;
System.out.print("Multiplication is : "+multi);
}
}
