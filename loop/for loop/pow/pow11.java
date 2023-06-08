//2^1/2 + 2^2/3 - 2^3/4 + 2^4/5 - 2^5/6 = 3.8000002

import java.util.Scanner;
class Pow11
{
public static void main(String[]arg)

 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,j=2, y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++,j++)
	 {	
		if(i%2==0)
		{
		 pow*=x;
		 sum-=(pow/j);
		 System.out.print(x+"^"+i+"/"+j);
		 if(i<y)
			  System.out.print(" - ");
		}

		else
		{
		 pow*=x;
		 sum+=(pow/j);
		 System.out.print(x+"^"+i+"/"+j);
		 if(i<y)
			  System.out.print(" + ");
		}	
	 }	 
		 System.out.println(" = "+sum);
 }
}