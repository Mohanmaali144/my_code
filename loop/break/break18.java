import java.util.Scanner;

class Break18
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; i<=10;i++)
		{	
			for(j=1; j<=10; j++)
			{	if(i%3==0)
					break;	
				System.out.println(i+" "+j);
			}
		}
	}
}

/*

*/	