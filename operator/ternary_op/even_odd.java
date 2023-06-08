/*Even or odd ____29/04/2023*/
import java.util.Scanner;

class EvenOdd
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any number :  ");
int num = sc.nextInt();

String ans = (num<0 ?"  Negative number":(num%2==0 ? "  Even number":"  Odd number"));

System.out.print(num+ ans);
}
}