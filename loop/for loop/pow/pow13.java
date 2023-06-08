//2/2^1 + 3/2^2 + 4/2^3 + 5/2^4 + 6/2^5 = 2.75

import java.util.Scanner;
class Pow13
{
public static void main(String[]arg)
 {
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,j=2,y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++,j++)
	 {	
		 pow*=x;
		 sum=sum+(j/pow);
		 System.out.print(j+"/"+x+"^"+i);
		 if(i<y)
			  System.out.print(" + ");
	 }	 
		 System.out.println(" = "+sum);
 }
}