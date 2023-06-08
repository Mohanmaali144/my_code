// for Any number

import java.util.Scanner;
class Armstrong2
{
public static void main(String[]arg)
{
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int r=0,arm=0,temp=n,count=0;

	do{
		
		count++;
		n=n/10;
	}while(n>0);
	
	n=temp;
	do{
		r=n%10;
		int i=1,pow=1;
		do{
			pow=pow*r;
		i++;	
		}while(i<=count);
			
		arm = arm+pow;
		n/=10;
	  }  while(n>0);
	
	
	if(arm==temp)
		System.out.println("Armstrong");
  
	else
		System.out.println("Not Armstrong");
}
}