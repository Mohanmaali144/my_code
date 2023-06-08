import java.util.Scanner;
// uncomplete
class Continue7
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=2; i<=10;i++);
		{	
			System.out.println(i);			
			
				if(i==3 || i>6)
				{
					continue;
				}
				System.out.println(i+1);				
		}
	}
}

/*
4
*/	