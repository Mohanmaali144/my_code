// substrection of two number

import java.util.Scanner;
class Substraction
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();

int substraction = num1 - num2;
System.out.print("Substraction is : "+substraction);
}
}
