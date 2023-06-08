// Ask.. user is indian or not, if user are indian, then check he elegible for vote or not

import java.util.Scanner;

class Test
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("If you are Indian then pres 'i' ");
System.out.println("If you are not Indian then pres 'n'");
char i =sc.next().charAt(0);

if(i=='i'){

System.out.println("Enter your age");
int age = sc.nextInt();

if(age>18)System.out.println("Eligible for vote: ");
if(age<18)System.out.println("Not Eligible for vote: ");
}
if(i=='n')System.out.println("Sorry.. You can not vote, Because you are not Indian: ");
}
}