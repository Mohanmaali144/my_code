import java.util.Scanner;

class Break11
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=5;i++)
		{	
			for(j=1; j<=3; j++)
			{	
				System.out.println(i+" "+j);
				if(j==2)
					break;
			}		
		}
	}
}

/*
1 1
1 2
2 1
2 2
3 1
3 2
4 1
4 2
5 1
5 2
*/	