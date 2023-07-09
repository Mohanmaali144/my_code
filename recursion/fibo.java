// fibonacci --------uncomplete--------
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
		ob.fibo(n);
	}	
	public int fibo(int n)
	{	
		if(n<=1)
		{
			return sum;
		}	
		System.out.println(sum+" ");	
		return sum=this.fibo(n-1)+ this.fibo(n-2);		
	}
	
}
