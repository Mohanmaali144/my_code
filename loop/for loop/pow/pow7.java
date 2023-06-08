// 1/2^1 + 2/2^2 + 3/2^3 + 4/2^4 + 5/2^5 = 1.78125

import java.util.Scanner;
class Pow7
{
public static void main(String[]arg)
 {
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++)
	 {	
		 pow*=x;
		 sum=sum+(i/pow);
		 System.out.print(i+"/"+x+"^"+i);
		 if(i<y)
			  System.out.print(" + ");
	 }	 
		 System.out.println(" = "+sum);
 }
}