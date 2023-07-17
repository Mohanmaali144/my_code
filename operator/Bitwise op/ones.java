/*Bitwise operator 
1's operator (ones operator)*/

import java.util.Scanner;
class Test
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a num: ");
		int num=sc.nextInt();
		
		System.out.println("num = "+num);
		num=~num;
		System.out.println("num = "+num);
		
		
	}
}	