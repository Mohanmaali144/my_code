import java.util.Scanner;

class Continue9
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<6;i++)
		{	
			for(j=2; j<8; j++)
			{
				if(i>3 || j==4 || j>6)
				continue;
			
				System.out.println(i++);
				
			}	
					
		}
	}
}

/*
1
2
3
*/	