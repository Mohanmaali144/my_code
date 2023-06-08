import java.util.Scanner;

class Break16
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<3; i++)
		{
			for(j=1; ; )
			{		
				System.out.println(i+j);
				if(j>2)
					break;
				j++;
			}
		}
	}
}
/*
2
3
4
3
4
5
*/	