//complete
import java.util.Scanner;
class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();
		System.out.println("fact = "+ob.fact(n));	
	}	
	public int fact(int n)
	{
		int fact;
		if(n==0)
		{
			fact=1;
		}
		else
		{
		  fact = n* this.fact(n-1);	
		}
		return fact;
	}
}