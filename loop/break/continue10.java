import java.util.Scanner;

class Continue10
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<10;i++)
		{	
			if(i>=3)
				continue;
			System.out.println(i++);		
		}
	}
}

/*
1
*/	