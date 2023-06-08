// 1!/1 - 2!/3 + 3!/5 - 4!/7  + 5!/9 =  11.438095

import java.util.Scanner;
class Fact23
{
	public static void main(String[]arg)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=1,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j+=2,fact*=i)
		{
			if(i%2==0)
			{
				sum-=(fact/j);
				if(i>1)
				System.out.print(" - ");
				System.out.print(i+"!/"+j);
			}
			else
			{
				sum+=(fact/j);
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+j);
			}
		}
		
		System.out.println(" = "+sum);
	}
}