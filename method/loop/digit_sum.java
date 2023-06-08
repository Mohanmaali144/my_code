
import java.util.Scanner;

class DigitSum
{  
	public void digitsum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = 0 ;
		while(num>0)
		{
			int r = num%10;
			num/=10;
			sum+=r ;
		}
		System.out.println("sum = "+sum);
	}
	
		
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		DigitSum ob = new DigitSum();
		ob.digitsum();	
	}	
}