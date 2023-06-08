// check year  is leap or not using ______if_else ________
import java.util.Scanner;

class Test
{

public static void main(String[]args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter a year: ");
int year = sc.nextInt();

if (year%4==0)
   {
   System.out.println(year+"  is leap year");
   }
   
 else
   {
   System.out.println(year+"  is not leap year");
   }
}
}