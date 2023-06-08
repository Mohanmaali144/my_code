import java.util.Scanner;

class Break4
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1;i<=5 ; i++)
		{		
			System.out.println(i);
			if(i>=9)
				break;						
		}
	}
}
/*
1
2
3
4
51
*/	