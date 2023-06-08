//  - 1/2^1 + 2/2^2 - 6/2^3 + 24/2^4 - 120/2^5


import java.util.Scanner;
class Power27
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,fact=1; 
double pow=1,sum=0;

 
	do{
	 pow= pow* x;
	 fact=fact*i;
	 if(i%2==0)
	 {
	 System.out.print(" + "+fact+"!"+"/"+x+"^"+i);
	 sum=sum+(fact/pow);
	 }
	 else
	 {
	 
	 sum=sum-(fact/pow);
	  
	 System.out.print(" - "+fact+"!"+"/"+x+"^"+i);
	 }
	 i++;
	}while(i<=y);
	System.out.println(" = "+sum);
  }
   }