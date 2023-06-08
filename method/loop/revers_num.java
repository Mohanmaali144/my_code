
import java.util.Scanner;

class ReversNum
{
	
	public void revers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int rev=0;
		while(num>0)
		{   
	
			int r = num%10;
			rev = rev*10+r;
			num=num/10;
		}
		
		System.out.println("revers = "+rev);
	}
	
	public static void main(String[]args)
	{
		ReversNum ob = new ReversNum();	
		ob.revers();

	}	
}