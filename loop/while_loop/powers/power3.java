 //- 2^1 + 2^2 - 2^3 + 2^4 - 2^5

import java.util.Scanner;
class Power3
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,power=1,sum=0;

 while(i<=y)
 {
	 power = power * x;
	
	 
	 if(i%2==0)
	 {
	 sum=sum+power;
	 System.out.print(" + "+x+"^"+i);
	 }
	 
	else
		 {
			 sum=sum-power;			
			 System.out.print(" - "+x+"^"+i);
		 }
	 
	 i++;
 }
 
	System.out.println(" = "+sum);
  }
   }