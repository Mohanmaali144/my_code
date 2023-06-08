import java.util.Scanner;

class Break9
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=5;i++)
		{	
			System.out.println(++i);
			if(i<5)
				break;				
		}
	}
}

/*
2
*/	