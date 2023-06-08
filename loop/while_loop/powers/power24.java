// - 2^1/1! + 2^2/2! - 2^3/6! + 2^4/24! - 2^5/120!

import java.util.Scanner;
class Power24
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,fact=1; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;
	 fact=fact*i;
	 if(i%2==0)
	 {
	 System.out.print(" + "+x+"^"+i+"/"+fact+"!");
	 sum=sum+(power/fact);
	 }
	 else
	 {
	 
	 sum=sum-(power/fact);
	
	  
	 System.out.print(" - "+x+"^"+i+"/"+fact+"!");
	 }
	 i++;
 }
 
	System.out.println(" = "+sum);
  }
   }