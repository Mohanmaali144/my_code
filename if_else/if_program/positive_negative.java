// check number is positive or negative

import java.util.Scanner;
class PositiveNegative
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number: ");
int num = sc.nextInt();

if(num>0)
{
System.out.println(num +"  is positive number");
}

if(num<0)
{
	System.out.println(num +"  is negative number");
}
}
}