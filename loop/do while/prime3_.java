

import java.util.Scanner;
class Prime_3
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2;
  
	do
	{
     if(n%i==0)
	 {
		 break;
	 }
	
	 i++;	 
	}while(i<n);
		
		if(i==n)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
}
}