import java.util.Scanner;

class Break6
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=1; ;)
		{	
			System.out.println(i++);
			if(i>1)
			{	break;
				continue;
				System.out.println(i++);
			}
		}
	}
}
/*
 unreachable statement
 Error
*/	