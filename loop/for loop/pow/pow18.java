// - 2^1/1 + 2^2/3 - 2^3/5 + 2^4/7 - 2^5/9 = -3.5365078

import java.util.Scanner;
class Pow18
{
public static void main(String[]arg)

 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,j=1,y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++,j+=2)
	 {	
		if(i%2==0)
		{
		 pow*=x;
		 sum+=(pow/j);
		 if(i<y)
			  System.out.print(" + ");
		  System.out.print(x+"^"+i+"/"+j);
		}

		else
		{
		 pow*=x;
		 sum-=(pow/j);
		 System.out.print(" - "+x+"^"+i+"/"+j);
		}	
	 }	 
		 System.out.println(" = "+sum);
 }
}