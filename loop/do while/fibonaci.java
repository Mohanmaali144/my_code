

import java.util.Scanner;
class Fibonaci
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,a=0,b=1,c=0;
  
	do
	{
     System.out.print(c+" ");
		a=b;
		b=c;
		c=a+b;
	 
	 i++;	 
	}while(i<=n);
		

}
}