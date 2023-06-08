//1/2^1 + 3/2^2 + 5/2^3 + 7/2^4 + 9/2^5

import java.util.Scanner;
class Power19
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,j=1; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;
	 System.out.print(j+"/"+x+"^"+i);
	 sum=sum+(j/power);
	 if(i<y)
		 System.out.print(" + ");
	 i++;
	 j+=2;
 }
 
	System.out.println(" = "+sum);
  }
   }