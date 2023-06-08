
import java.util.Scanner;

class Sum
{
	
	public void first_last()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int first_digit=0,sum=0;
		int last_digit = num%10;
		while(num>0)
		{   
			first_digit = num%10;
			num=num/10;
		}
		
		sum = last_digit + first_digit;
		System.out.println("sum = "+sum);
	}
	
	public static void main(String[]args)
	{
		Sum ob = new Sum();	
		ob.first_last();

	}	
}