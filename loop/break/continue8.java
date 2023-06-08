import java.util.Scanner;

class Continue8
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=8;i++)
		{	
			for(j=1; j<=5; j+=2)
			{
				if(i>2)
				continue;
			
				System.out.println(j++);
				
			}	
					
		}
	}
}

/*
1
4
1
4
*/	