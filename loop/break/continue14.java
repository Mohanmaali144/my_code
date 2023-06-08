import java.util.Scanner;

class Continue14
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		for(i=1; i<=10;i++)
		{	
			if(4<i)
				continue;
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