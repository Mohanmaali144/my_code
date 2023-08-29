/*squre of naturel num  n time*/

import java.util.Scanner;
class Square
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int i=1;
		int sqr=0;

		while(i<=n)
		{		 
			sqr = i*i;		 
			System.out.print(sqr+" ");
			i++;
		}			
	}
}