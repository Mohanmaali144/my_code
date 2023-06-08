/*revers of digit n number*/
/*05/05/023*/

import java.util.Scanner;
class Revers
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int re=0,rev=0;

while(n>0)
{
	re=n%10;
	rev = (rev *10)+re;
	n/=10;
}
System.out.println("revers number  = "+rev);

}
}