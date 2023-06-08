//2^1/1! + 2^2/2! + 2^3/6! + 2^4/24! + 2^5/120!

import java.util.Scanner;
class Power22
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
     fact = fact*i;
	 pow= pow * x;
	 System.out.print(x+"^"+i+"/"+fact);
	 sum=sum+(pow/fact);
	 if(i<y)
		 System.out.print(" + ");
	 i++;
	 
	} while(i<=y);
 
	System.out.println(" = "+sum);
  }
   }