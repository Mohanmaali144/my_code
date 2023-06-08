import java.util.Scanner;

class Continue12
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		for(i=1; i<20;i++)
		{	
			if(i%2==0)
				continue;
			System.out.println(i);
					
		}
	}
}

/*
1
3
5
7
9
11N
13
15
17
19
*/	