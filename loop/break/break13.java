import java.util.Scanner;

class Break13
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=10;i+=2)
		{	
			for(j=i; j<=5; j++)
			{	
				System.out.println(j);
				if(j>i)
					break;
			}
			if(j>=3)
				break;
		}
	}
}

/*
1
2
3
4
*/	