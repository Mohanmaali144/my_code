//  - 1!/2^1 + 2!/2^2 - 6!/2^3 + 24!/2^4 - 120!/2^5


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
		double power=1;
		double sum=0;

		 while(i<=y)
		 {
			 power = power * x;
			 fact=fact*i;
			 if(i%2==0)
			 {
			 System.out.print(" + "+fact+"!"+"/"+x+"^"+i);
			 sum=sum+(fact/power);
			 }
			 else
			 {
			 
			 sum=sum-(fact/power);
			  
			 System.out.print(" - "+fact+"!"+"/"+x+"^"+i);
			 }
			 i++;
		 }
		 
			System.out.println(" = "+sum);
	  }
   }