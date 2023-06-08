// String sum

import java.util.Scanner;
class SumString
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);



System.out.print("Enter first number: ");
int num1= sc.nextInt();

System.out.print("Enter second number: ");
int num2= sc.nextInt();

System.out.print("Enter String: ");
String s = sc.next();

System.out.print("sum is :   "num1+num2+s);
}
}
