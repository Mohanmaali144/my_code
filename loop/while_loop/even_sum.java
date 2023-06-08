/*only sum of even number*/

import java.util.Scanner;
class EvenSum
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int i=1;
		int sum=0,ans=0;
		while(i<=n)
		{		 
			 ans = i*2;		 
			 sum = sum+ans;
			 
		 i++;
		}
		System.out.print("some of even number = "+sum);

	}
}