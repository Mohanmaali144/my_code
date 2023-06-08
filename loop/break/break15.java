import java.util.Scanner;

class Break15
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=10;i++)
		{	
			for(j=8; j<=10; j--)
			{	
				System.out.println(i+" "+j);
				if(i<=7)
					break;
				System.out.println(i++);
			}

		}
	}
}

/*
1 8
2 8
3 8
4 8
5 8
6 8
7 8
8 8
8
9 9
9
10 10
10
*/	