
//  2/1! + 3/2! + 4/3! + 5/4! + 6/5! = 4.425

import java.util.Scanner;
class Fact13
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=2,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j++,fact*=i)
		{
			sum+=(j/fact);
			if(i>1)
				System.out.print(" + ");
			System.out.print(j+"/"+i+"!");
		}
		
		System.out.println(" = "+sum);
	}
}