import java.util.Scanner;
class EvenDigit
{  
	public void digit_sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i,sum=0;
		while(n>0)
		{
			int re = n%10;
			if(re%2==0)
			sum+=re;
			n/=10;
		}
		System.out.println("Sum = "+sum);
	}	
	public static void main(String[]args)
	{
		EvenDigit ob = new EvenDigit();
		ob.digit_sum();	
	}	
}