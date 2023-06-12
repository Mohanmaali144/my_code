//uncomplete
import java.util.Scanner;
class Test
{
	public static void main(String []arg)
	{
		int n=10;
		Test ob = new Test();
		System.out.println("sum = "+ob.n_sum(n));
		
	}
	
	public int n_sum(int n)
	{
		if(n>0)
		{
			return sum+=n_sum(n-1);
			//System.out.println("sum = "+sum+=n_sum(n-1));
		}
		return 0;
	}
}