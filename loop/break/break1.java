import java.util.Scanner;

class Break1
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<10; i++)
		{			
			if(i==5)
				break;		
			System.out.println(i);			
		}
	}
}
/*
1
2
3
4
*/	