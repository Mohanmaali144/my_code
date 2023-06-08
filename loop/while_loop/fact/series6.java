
//continue

import java.util.Scanner;
class Series6
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int i=1,n = sc.nextInt();
double sum=0,fact=1;

	while(i<=n)
	{			
		fact *=i;
		sum = sum + (i/fact);	
		if(i>1)
		{
			System.out.print(" + ");
		}
		System.out.print(i+"/!"+i);		
		i++;
	}
	
	System.out.println(" = "+ sum);
}
}