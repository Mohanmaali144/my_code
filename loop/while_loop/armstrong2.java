// check Armstron of Any number

 import java.util.Scanner;
class Armstrong2
{
	public static void main(String[]arg)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();

		int temp=n,arm=0,re=0,count=0,pow=1,i=1; 

		while(n>0)
		{
			n=n/10;
			count++;
		}

		n=temp;

		while(n>0)
		{  
			re = n%10;
			i=1;pow=1;

			while(i<=count)
			{
			pow=pow*re;
			i++;
			}	
			arm=arm+pow;
			n=n/10;	
		}
		if(arm==temp)
			System.out.println(" Armstrong");
		else 
			System.out.println(" Not Armstrong");
	}
}