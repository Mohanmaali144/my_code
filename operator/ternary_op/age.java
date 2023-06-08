/*check age ____29/04/2023*/
import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any age :  ");
int age = sc.nextInt() ;

String ans = age<=0?"Invalid age":(age>0&&age<13 ? "child age":(age>12&&age<20?"teen age":(age>19&&age<60?"young age":"old age")));

System.out.print(ans);
}
}