// three digit
import java.util.Scanner;
class Armstrong
{  
	public void check_arm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int temp =n,arm=0;
		while(n>0)
		{
			int re = n%10;
			 arm = arm+=(re*re*re);
			n/=10;
		}
		if(arm==temp)
			System.out.println(temp+" is Armstrong number");
		else
			System.out.println(temp+" is not Armstrong number");		
	}	
	public static void main(String[]args)
	{
		Armstrong ob = new Armstrong();
		ob.check_arm();	
	}	
}