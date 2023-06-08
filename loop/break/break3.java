import java.util.Scanner;

class Break3
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1;i<20 ; i+=2)
		{		
			System.out.println(i);
			if(i>10)
				break;						
		}
	}
}
/*
1
3
5
7
9
11
*/	