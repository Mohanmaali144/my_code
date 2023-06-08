import java.util.Scanner;

class DecimalToBinary
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number   ");
		int de=0,sum=0, n = sc.nextInt();
		
		while(n>0)
		{
		  de = n%2;
		  sum = (sum*2)+de;
		  System.out.print(de);		 
		  n=n/2;
		  
		}
		System.out.println("\n\n\t"+sum);
}}		