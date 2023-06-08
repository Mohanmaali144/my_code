
/*04/05/2023*/

import java.util.Scanner;
class Series5
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int i=1,n = sc.nextInt();
double sum=0,fact=1;

	while(i<=n)
	{
		if(i%2==0)
		{		
			fact *=i;
			sum = sum + (fact/i);
			
				System.out.print(" + !"+i+"/"+i);
			
			
		}
		else
		{			
			fact*=i;
			sum = sum - (fact/i);
			
			if(i>1)
			{
				System.out.print(" - ");
			}
			System.out.print("!"+i+"/"+i);			
		}
		i++;
	}
	
	System.out.println(" = "+ sum);
}
}