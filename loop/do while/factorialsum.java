

import java.util.Scanner;
class FactorialSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int fact=1,sum=0;   
	do
	{
     fact = fact*i;
	 sum=sum+fact;
	 System.out.print(fact);	 
	 if(i<n)
		  System.out.print(" + ");
	 i++;	 
	}while(i<=n);
		
		System.out.println(" = "+sum);	
}
}