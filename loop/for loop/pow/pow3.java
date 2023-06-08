//  - 2^1 + 2^2 - 2^3 + 2^4 - 2^5 = -22

import java.util.Scanner;
class Pow3
{
public static void main(String[]arg)

 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1, sum=0,pow=1;
     
	 for(i=1; i<=y;i++)
	 {	
		if(i%2==0)
		{
		 pow*=x;
		 sum+=pow;
		 if(i>1)
			  System.out.print(" + ");
		  System.out.print(x+"^"+i);
		}
		
	   else	
		{
		 pow*=x;
		 sum-=pow;
		 System.out.print(" - "+x+"^"+i);
		}
	 }	 
		 System.out.println(" = "+sum);
 }
}