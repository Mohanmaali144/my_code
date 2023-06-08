
// 1/1! + 2/2! + 3/3! + 4/4! + 5/5! = 2.7083335

import java.util.Scanner;
class Fact7
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,fact*=i)
		{
			sum+=(i/fact);
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"/"+i+"!");
		}
		
		System.out.println(" = "+sum);
	}
}