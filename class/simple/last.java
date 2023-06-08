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
int last_digit= num%10;
num=num/10;
int a=num%10;
num =num/10;
int b=num%10;
num=num/10;
int c=num%10;
num=num/10;
int ans =last_digit + num;
System.out.println("sum of last and first digit:  "+ans);
}
}
}