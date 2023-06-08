

import java.util.Scanner;
class FiboSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,a=0,b=1,c=0,sum=0;
  
	do
	{
     System.out.print(c+" ");
	 sum=sum+c;
	 if(i<n)
		 System.out.print(" + ");

		a=b;
		b=c;
		c=a+b;
	 
	 i++;	 
	}while(i<=n);
		
System.out.print(" = "+sum);
}
}