//Square of middile digit in number of five digit

import java.util.Scanner;
class Middle
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of Five digit");

int num =sc.nextInt();

if(num>10000)
{
num=num/10;
num =num/10;
int ans = num%10;


System.out.println("middle digit:  "+ans);
System.out.println("and Square is :   "+(ans*ans));
}
}
}