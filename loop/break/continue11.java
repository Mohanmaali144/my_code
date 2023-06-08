import java.util.Scanner;

class Continue11
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=10; i>2;i--)
		{	
			for(j=i; j>5; j--)
			{
				if(j==6 || i==6)
				continue;
				System.out.println(j);
			}		
		}
	}
}

/*
10
9
8
7
9
8
7
8
7
7
*/	