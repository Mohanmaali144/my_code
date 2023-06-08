

import java.util.Scanner;
class Factorial
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int fact=1;   
	do
	{
     fact = fact*i;
	 i++;	 
	}while(i<=n);
		
		System.out.println(fact);	
}
}