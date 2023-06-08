//2^1/1! + 2^2/2! + 2^3/6! + 2^4/24! + 2^5/120! = 6.266667

import java.util.Scanner;
class Pow22
{
public static void main(String[]arg)

 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,fact=1, y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++)
	 {	
         fact*=i;
		 pow*=x;
		 sum+=(pow/fact);
		 System.out.print(x+"^"+i+"/"+fact+"!");
		 if(i<y)
			  System.out.print(" + ");
	 }	 
		 System.out.println(" = "+sum);
 }
}