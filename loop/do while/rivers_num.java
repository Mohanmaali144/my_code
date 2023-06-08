

import java.util.Scanner;
class ReversNum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int r=0,rev=0;


	do{
		r=n%10;
		rev = (rev *10)+r;
		n/=10;
	} while(n>0);
System.out.println("revers number is : "+rev);

}
}