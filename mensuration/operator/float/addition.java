// addition of two number

import java.util.Scanner;

class Addition
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter first number:" );
float n1 = sc.nextFloat();


System.out.print("Enter second number:" );
float n2 = sc.nextFloat();

float addition = n1+n2;

System.out.print("Addition is : "+addition);
}
}
