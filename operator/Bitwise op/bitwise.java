/*Bitwise operator 
OR  AND   XOR   operator*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A|B = "+(a|b));
		System.out.println("A&B = "+(a&b));
		System.out.println("A^B = "+(a^b));
	}
}
