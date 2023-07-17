//2^1/2 + 2^2/3 + 2^3/4 + 2^4/5 + 2^5/6

import java.util.Scanner;
class Power10
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:   ");
		int x = sc.nextInt();

		System.out.println("Enter range:   ");
		int y = sc.nextInt();
		int i=1,j=2; 
		double power=1;
		double sum=0;

		 while(i<=y)
		 {
			 power = power * x;
			 System.out.print(x+"^"+i+"/"+j);
			 sum=sum+(power/j);
			 if(i<y)
				 System.out.print(" + ");
			 i++;
			 j++;
		 }
		 
			System.out.println(" = "+sum);
	  }
   }