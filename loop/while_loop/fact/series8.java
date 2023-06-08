

import java.util.Scanner;
class Series8
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int i=1, n = sc.nextInt();
double sum=0,fact=1;

	while(i<=n)
	{
		if(i%2==0)
		{
			
			fact=fact*i;			
			sum= sum +(i/fact);				
			System.out.print(" + "+i+"/!"+i);				
		}
		else
		{		
			fact =fact*i;		
			sum= sum - (i/fact);
			System.out.print(" - "+i+"/!"+i);
			
		}
		i++;
	}
	
	System.out.println(" = "+ sum);
}
}