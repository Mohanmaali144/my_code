import java.util.Scanner;

class Break7
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=2;i++)
		{	
			for(j=1; ;)
			{
				System.out.println(j++);
				if(j>3)
					break;	
			}		
		}
	}
}

/*
1
2
3
1
2
3
*/	