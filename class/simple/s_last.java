//sum of second first and second last digit of 5 digit number

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
int s_l=num%10;
num =num/10;
num=num/10;
int f_f=num%10;

int ans = s_l + f_f;
System.out.println("sum of last and first digit:  "+ans);
System.out.println("and Square is :   "+(ans*ans));
}
}
}