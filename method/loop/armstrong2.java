
import java.util.Scanner;
class Armstrong2
{  
	public void check_arm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int temp =n,arm=0,count=0;
		
		while(n>0)
		{
			count++;
			n/=10;
		}
		n=temp;	
		while(n>0)
		{
			int pow = 1,re = n%10;	
			for(int i=1; i<=count; i++)
				pow*=re;
				
			arm+=pow;	
			n/=10;	
		}
		if(arm==temp)
			System.out.println(temp+" is Armstrong number");
		else
			System.out.println(temp+" is not Armstrong number");		
	}	
	public static void main(String[]args)
	{
		Armstrong2 ob = new Armstrong2();
		ob.check_arm();	
	}	
}