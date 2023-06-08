/*sum of digit n number*/
/*05/05/023*/

import java.util.Scanner;
class DigitSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int sum = 0,r=0;

while(n>0)
{
	r=n%10;
	sum+=r;
	n/=10;
}
System.out.println("Sum of Digit = "+sum);
}
}