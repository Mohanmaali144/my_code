// check first number is Divisible by second number or nots

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any number:  ");
int num1 = sc.nextInt();

System.out.print("Enter Diviser num ");
int num2 = sc.nextInt();

if(num1%num2==0);
{
System.out.print(num1 +" Divisible by "+num2);
}

}
}