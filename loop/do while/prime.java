

import java.util.Scanner;
class Prime
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2,count=0;
  
	do
	{
     if(n%i==0)
	 {
		 count++;
	 }
	
	 i++;	 
	}while(i<n);
		
		if(count>0)
		{
			System.out.println("Not prime");
		}
		else 
		{
			System.out.println("prime");
		}
}
}