// prime number 2 to n term

import java.util.Scanner;
class PrimeSeries
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int i,j;
  
  for(j=2; j<=n; j++)
  { 
	 for(i=2; i<j; i++)
	{
	  if(j%i==0)
	  { 
		 break;
	  }
	}
  if(i==j)
	  System.out.println(j); 
  } 
}
}