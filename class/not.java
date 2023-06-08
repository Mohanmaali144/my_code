// Count not of given amount
import java.util.Scanner;
class CountNot{

public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter amount: ");
int a = sc.nextInt();
int not500,not200,not100,not50,not20,not10,not5,not2,not1;

not500 = a/500;
a = a%500;

not200 = a/200;
a = a%200;

not100=a/100;
a=a%100;

not50= a/50;
a= a%50	; 

not20=a/20;
a= a%20;

not10=a/10;
a=a%10;

not5= a/5;
a=a%5;

not2=a/2;
a=a%2;
not1 = a;
System.out.println("not of 500 = "+not500);
System.out.println("not of 200 = "+not200);
System.out.println("not of 100 = "+not100);
System.out.println("not of 50  = "+not50);
System.out.println("not of 20  = "+not20);
System.out.println("not of 10  = "+not10);
System.out.println("not of 5   = "+not5);
System.out.println("not of 2   = "+not2);
System.out.println("not of 1   = "+not1);
}
}