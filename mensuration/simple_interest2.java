// Simple interest

import java.util.Scanner;

class SimpleInterest
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter prenciple amount: " );
		float p = sc.nextFloat();
		System.out.print("Enter rate: " );
		float r = sc.nextFloat();
		System.out.print("Enter time in year: " );
		int t = sc.nextInt();
		float amount = p*(1+(r/100)*t);
		System.out.println("total amount is : "+amount);
		System.out.println("Simple Interest is : "+(amount-p));
	}
}
