//2^1/1 + 2^2/2 - 2^3/3 + 2^4/4 - 2^5/5 = 5.0666666

import java.util.Scanner;
class Pow5
{
public static void main(String[]arg)

 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i, y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++)
	 {	
		if(i%2==0)
		{
		 pow*=x;
		 sum-=(pow/i);
		 System.out.print(x+"^"+i+"/"+i);
		 if(i<y)
			  System.out.print(" - ");
		}

		else
		{
		 pow*=x;
		 sum+=(pow/i);
		 System.out.print(x+"^"+i+"/"+i);
		 if(i<y)
			  System.out.print(" + ");
		}	
	 }	 
		 System.out.println(" = "+sum);
 }
}