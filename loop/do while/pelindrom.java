

import java.util.Scanner;
class Pelindrom
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int r=0,sum=0,temp=n;


	do{
		r=n%10;
		sum = (sum*10)+r;
		n/=10;
	  } while(n>0);
	
	if(sum==temp)
		System.out.println("pelindrom");
  
	else
		System.out.println("Not pelindrom");
}
}