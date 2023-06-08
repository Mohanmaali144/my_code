
//1!/2 + 2!/3 + 3!/5 + 4!/7 + 5!/9 =  19.62857

import java.util.Scanner;
class Fact22
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=1,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j+=2,fact*=i)
		{
			sum+=(fact/j);
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"!/"+j);
		}
		
		System.out.println(" = "+sum);
	}
}