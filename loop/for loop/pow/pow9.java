//  - 1/2^1 + 2/2^2 - 3/2^3 + 4/2^4 - 5/2^5 = -0.28125

import java.util.Scanner;
class Pow9
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1;
float sum=0,pow=1;
     
	for(i=1; i<=y; i++)
	{
		pow*=x;
		if(i%2==0)
		{
		 sum+=(i/pow);
		 System.out.print(" + "+i+"/"+x+"^"+i);
		}
		else
		{
			sum-=(i/pow);
			System.out.print(" - "+i+"/"+x+"^"+i);
		}
		
	}
	System.out.print(" = "+sum);
}
}