

import java.util.Scanner;
class Prime2
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2,flag=1;
  
	do
	{
     if(n%i==0)
	 {
		flag=0;
		 break;
	 }
	
	 i++;	 
	}while(i<n);
		
		if(flag==0)
		{
			System.out.println("Not prime");
		}
		else 
		{
			System.out.println("prime");
		}
}
}