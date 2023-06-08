//  - 2^1/2 + 2^2/3 - 2^3/4 + 2^4/5 - 2^5/6

import java.util.Scanner;
class Power12
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1,j=2;
double sum=0,pow=1;
     
	 do{
		 pow = pow*x;
		 
		 if(i%2==0)
		 {	 
		 sum+=(pow/j);
		 System.out.print(" + "+x+"^"+i+"/"+j);
		 }
	    else
		{
			
				
			    sum-=(pow/j);
			 System.out.print(" - "+x+"^"+i+"/"+j);
			
		}  
		 i++;
		j++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}