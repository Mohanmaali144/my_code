// check Eligible for vote or not

import java.util.Scanner;
class Test
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter your age");
int age =sc.nextInt();

if(age>=18)
{
System.out.println("you can vote");;
}
else
{
System.out.println("You can't vote");
}
}
}