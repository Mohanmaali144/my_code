import java.util.Scanner;

class PositiveNegative
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number   ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.print(n+"  positiev number");
		
		else if(n==0)
		System.out.print(n+" Zero");
	
		else
			System.out.print(n+" negative");
}}		