/*check number is Palindrom or not */
/*05/05/023*/

import java.util.Scanner;
class Palindrom
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int re=0,rev=0,temp=n;

		while(n>0)
		{
			re=n%10;
			rev = (rev *10)+re;
			n/=10;
		}

			if(temp==rev)
			{
				System.out.println(temp+ "  is Palindrom");
			}
			else
				System.out.println(temp+" is not palindrom");

	}
}