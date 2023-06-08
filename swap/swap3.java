// swap number without use third variable

import java.util.Scanner;

class SwapThree
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter Vlaue of A: " );
int a = sc.nextInt();


System.out.print("Enter value of B: " );
int b = sc.nextInt();

System.out.println("Before swaping\n A = "+a +"\n B = "+b);
      a = b*a;
      b = a/b;
      a = a/b;

System.out.println("After swaping\n A = "+a+ "\n B = "+b);
}
}
