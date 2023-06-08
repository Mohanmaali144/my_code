// addition of two number

import java.util.Scanner;

class Addition
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter first number: " );
double n1 = sc.nextDouble();


System.out.print("Enter second number:" );
double n2 = sc.nextDouble();

double addition = n1+n2;

System.out.print("Addition is : "+addition);
}
}
