//three digit

import java.util.Scanner;
class Armstrong
{
public static void main(String[]arg)
{
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int r=0,arm=0,temp=n;


	do{
		r=n%10;
		arm = arm+(r*r*r);
		n/=10;
	  } while(n>0);
	
	if(arm==temp)
		System.out.println("Armstrong");
  
	else
		System.out.println("Not Armstrong");
}
}