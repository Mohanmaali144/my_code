import java.util.Scanner;

class Continue13
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		for(i=10; i>1;i--)
		{	
			if(i==9 || i==7 || i==3)
				continue;
			System.out.println(i);
					
		}
	}
}

/*
10
8
6
5
4
2
*/	