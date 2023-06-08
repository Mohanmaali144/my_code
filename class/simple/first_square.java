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

num=num/10;
num =num/10;
num=num/10;
num=num/10;
int ans = num;
System.out.println(" First  digit:  "+ans);
System.out.println(" and Square is:  "+(ans*ans));
}
}
}