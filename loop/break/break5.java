import java.util.Scanner;

class Break5
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=0;i<=3 ; i++)
		{
			for(j=1; j<3; j++)
			{	if(j>2)
				break;
			
			System.out.println(i+" "+j);
			}
			if(i>1)
				break;
		}
	}
}
/*
0 1
0 2
1 1
1 2
2 1
2 2
*/	