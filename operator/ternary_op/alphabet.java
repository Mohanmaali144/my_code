/*alphabet or not ____29/04/2023*/
import java.util.Scanner;

class Alphabet
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any character :  ");
char ch = sc.next().charAt(0) ;

String ans = (ch>=65&&ch<=90||ch>=97&&ch<=122 ?"  is Alphabet":"  not Alphabet");

System.out.print(ch+ ans);
}
}