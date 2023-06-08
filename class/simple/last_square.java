//Square of first digit in number of five digit;

import java.util.Scanner;
class Test
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of Five digit");

int num =sc.nextInt();

if(num>10000)
{

num=num%10;

System.out.println(" Last  Digit:  "+num);
System.out.println(" and Square is:  "+(num*num));
}
}
}