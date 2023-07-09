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
		System.out.println("Digit sum = "+ob.digitSum(n));	
	}  	
	public int digitSum(int n)
	{
		int sum=0;
		if(n==0)
		{
			return sum;
		}
		int re =n%10;
		sum=re+this.digitSum(n/10);
		return sum;
	}
}