import java.util.Scanner;

class Break17
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=0; i<=20; i++)
		{
			for(j=1; j<15; j++)
			{
				if(i==3)
					break;
				
				System.out.println(i+" "+j);
				if(j>2)
					break;
				
			}
			System.out.println(i);
			if(i==3)
				break;
		}
	}
}
/*
0 1
0 2
0 3
0
1 1
1 2
1 3
1
2 1
2 2
2 3
2
3
*/	