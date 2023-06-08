// swap number use third variable

import java.util.Scanner;

class Swap
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter Vlaue of A: " );
int a = sc.nextInt();


System.out.print("Enter value of B: " );
int b = sc.nextInt();

System.out.println("Before swaping\n A = "+a +"\n B = "+b);
int temp = a;
      a =b;
      b = temp;



System.out.println("After swaping\n A =  "+a+ "\n B = "+b);
}
}
