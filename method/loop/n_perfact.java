// uncomplete
import java.util.Scanner;
class N_Perfact
{  
	public void check_perfact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int count=0;
		for(long i=1; ; i++)
		{	long sum =0;
			for(long j=1; j<i; j++)	
			{	
				if(i%j==0)
					sum+=j;	
			}
			if(sum==i)
			{  
				count++;
				System.out.println(i);
			}	
			if(count==n)
				break;
		}		
	}	
	public static void main(String[]args)
	{
		N_Perfact ob = new N_Perfact();
		ob.check_perfact();	
	}	
}