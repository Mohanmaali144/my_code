/*leap year check all condtion*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year:  ");
		int year =sc.nextInt(); 
			
		if(year>&&year<20000)
		{		
			if(year%400==0 ||(year%4==0 && year%100!=0))
			{
				System.out.println(year+"  is leap year");
			}
			else
				System.out.println(year+"  is not leap year");
		}
		else
			System.out.println("Invalid year !!........");
		}
}