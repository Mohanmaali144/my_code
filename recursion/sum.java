//complete
import java.util.Scanner;
class Test
{
	int sum=0;
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();
		System.out.println("sum = "+ob.sum(n));	
	}	
	public int sum(int n)
	{
		if(n==0)
		{
			sum=0;
		}
		else
		{
		  sum = n+ this.sum(n-1);	
		}
		return sum;
	}
}