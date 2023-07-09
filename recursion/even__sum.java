/*
uncompelete	
*/
import java.util.Scanner;
class Test
{
	int sum =0;
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();		
			System.out.println("Even sum = "+ob.eSum(n));			
	}	
	public int eSum(int n)
	{
		if(n==0)
		{
			return sum;
		}
		if(n%2==0)
		{
			sum+=n;
		}
		return eSum(n-1);
	}
}