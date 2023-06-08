//  - 2^1/1 + 2^2/2 - 2^3/3 + 2^4/4 - 2^5/5

import java.util.Scanner;
class Power6
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1;
double sum=0,pow=1;
     
	 do{
		 pow = pow*x;
		 
		 if(i%2==0)
		 {	 
		 sum+=(pow/i);
		 System.out.print(" + "+x+"^"+i+"/"+i);
		 }
	    else
		{
			  sum-=(pow/i);
			 System.out.print(" - "+x+"^"+i+"/"+i);
			
		}  
		 i++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}