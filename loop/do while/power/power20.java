// 1/2^1 - 3/2^2 + 5/2^3 - 7/2^4 + 9/2^5

import java.util.Scanner;
class Power20
{
public static void main(String[]arg)

{
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,j=1; 
double pow=1,sum=0;
   do{
	 pow = pow * x;
	 
	 if(i%2==0)
	 {
	 System.out.print(" - "+j+"/"+x+"^"+i);
	 sum=sum-(j/pow);
	 }
	 else
	 {	 
		 sum=sum+(j/pow);
		 if(i>1)
		 System.out.print(" + ");	  
		 System.out.print(j+"/"+x+"^"+i );
	 }
	 i++;
	 j+=2;
	} while(i<=y);
	System.out.println(" = "+sum);
  }
 }