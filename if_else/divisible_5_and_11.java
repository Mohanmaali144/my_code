 /*Check whether a number is divisible by 5 and 11 or not.*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number:  ");
	int num = sc.nextInt();
	
	
	if(num<0)
	{
	System.out.println(" is divisible by 5 and 11");
	}
	
   else if(num%5==0 && num%11==0)
	{ 
	  System.out.println(num+"  is divisible by 5 and 11");
	}
	else 
	{ 
	  System.out.println(num+ " is not divisible by 5 and 11");
	}
	
	
	}
}
