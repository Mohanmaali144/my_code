//1/2^1 + 3/2^2 + 5/2^3 + 7/2^4 + 9/2^5 = 2.59375

import java.util.Scanner;
class Pow19
{
public static void main(String[]arg)
 {
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,j=1,y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++,j+=2)
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