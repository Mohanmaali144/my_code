//1!/2 + 2!/3 + 3!/4 + 4!/5 + 5!/6 =  27.466666666

import java.util.Scanner;
class Fact10
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=2,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j++,fact*=i)
		{
			sum+=(fact/j);
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"!/"+j);
		}
		
		System.out.println(" = "+sum);
	}
}