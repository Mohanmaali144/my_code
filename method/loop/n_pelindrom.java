
import java.util.Scanner;

class N_Pelindrom
{  
	public void pelindrom()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int count=0;
		for(int i=1; ; i++ )
		{	
			int temp = i,rev=0 ;
			while(i>0)
			{
				int re = i%10;
				rev = rev*10+re;
				i/=10;		
			}
			
			if(rev==temp)
			{
				count++;
				System.out.println(rev+" ");	
			}	
			if(count==n)
				break;
			
			i=temp;
		}				
	}	
	public static void main(String[]args)
	{
		N_Pelindrom ob = new N_Pelindrom();
		ob.pelindrom();	
	}	
}