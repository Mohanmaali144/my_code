//  - 2/2^1 + 3/2^2 - 4/2^3 + 5/2^4 - 6/2^5 = -0.625

import java.util.Scanner;
class Pow15
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1,j=2;
float sum=0,pow=1;
     
	for(i=1; i<=y; i++,j++)
	{
		pow*=x;
		if(i%2==0)
		{
		 sum+=(j/pow);
		 System.out.print(" + "+j+"/"+x+"^"+i);
		}
		else
		{
			sum-=(j/pow);
			System.out.print(" - "+j+"/"+x+"^"+i);
		}
		
	}
	System.out.print(" = "+sum);
}
}