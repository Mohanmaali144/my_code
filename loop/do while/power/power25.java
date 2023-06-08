// 1!/2^1 + 2!/2^2 + 6!/2^3 + 24!/2^4 + 120!/2^5

import java.util.Scanner;
class Power25
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,fact=1; 
double pow=1;
double sum=0;

 
	do{
	 pow = pow * x;
	 fact=fact*i;
	 System.out.print(fact+"/"+x+"^"+i);
	 sum=sum+(fact/pow);
	 if(i<y)
		 System.out.print(" + ");
	 i++;
	}while(i<=y);
 
	System.out.println(" = "+sum);
  }
   }