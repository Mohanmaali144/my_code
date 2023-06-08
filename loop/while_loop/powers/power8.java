
//1/2^1 - 2/2^2 + 3/2^3 - 4/2^4 + 5/2^5

import java.util.Scanner;
class Power8
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;	
	 
	 if(i%2==0)
	 {		
		System.out.print(" - "+i+"/"+x+"^"+i);
		sum=sum-(i/power);
	 }	
	 
	else
	{	
        if(i>1)
		System.out.print(" + ");
	
		System.out.print(i+"/"+x+"^"+i);
		sum=sum+(i/power);
	}	
	 i++;
 }
 
	System.out.println(" = "+sum);
  }
   }