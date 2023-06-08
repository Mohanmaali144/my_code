// n prime number 

import java.util.Scanner;
class PrimeSeries2
{
	public static void main(String[]arg)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a num");  
	  int n = sc.nextInt();
	  int i,j;
	  int count = 0 ;
	  for(j=2; ; j++)
	  { 
		 for(i=2; i<j; i++)
		{
			  if(j%i==0)
			  { 
				 break;
			  }
		}
		  if(i==j)
		  {  
			System.out.println(j);
			count++;		
		  }
		 if(count==n)
			break; 
	  } 
	}
}