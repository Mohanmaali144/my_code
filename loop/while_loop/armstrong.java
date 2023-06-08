//only 3 digit number
 import java.util.Scanner;
class Armstrong
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int temp=n,arm=0,re=0; 
		while(n>0)
		{
			re = n%10;
			arm = arm + (re*re*re);
			n=n/10;
		}
		if(arm==temp)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");
	}
}