.// 1  + 4  + 9  + 16  + 25

import java.util.Scanner;
class SqrSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int sum=0,sqr=0;   
	do
	{
      sqr = i*i;	  
	  System.out.print(sqr+" ");
	  if(i<n)
		  System.out.print(" + ");	  
	  sum=sum+sqr;  
	 i++;	 
	}while(i<=n);
	
	System.out.print(" = "+sum);
	
}
}