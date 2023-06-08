import java.util.Scanner;

class Break2
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; ; i++)
		{		
			System.out.println(i);
			if(i>10)
				break;						
		}
	}
}
/*
1
2
3
4
5
6
7
8
9
10
11
*/	