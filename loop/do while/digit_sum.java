

import java.util.Scanner;
class DigitSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int r=0,sum=0;


	do{
		r=n%10;
		sum = sum+r;
		n/=10;
	  } while(n>0);
System.out.println("sum of Digit : "+sum);

}
}