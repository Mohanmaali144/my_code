
import java.util.Scanner;
class  N_Armstrong
{  
	public void print_arm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int count2=0;
		
		for(int i=1; ; i++)
		{	
			int temp = i,arm=0,count1=0;
			while(i>0)
			{
				count1++;
				i/=10;
			}
			i=temp;	
			while(i>0)
			{
				int pow = 1,re = i%10;	
				for(int j=1; j<=count1; j++)
					pow*=re;
					
				arm+=pow;	
				i/=10;	
			}
			if(arm==temp)
			{
				count2++;
				System.out.println(temp+" ");
			}
			if(count2==n)
				break;
			i=temp;
		}
	}	
	public static void main(String[]args)
	{
		N_Armstrong ob = new N_Armstrong();
		ob.print_arm();	
	}	
}