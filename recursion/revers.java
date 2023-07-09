//complete with globel variable
import java.util.Scanner;
class Test
{
	int rev=0;
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();
		System.out.println("revers = "+ob.rev(n));	
	}  	
	public int rev(int n)
	{
		if(n!=0)
		{
			int re = n%10;
			rev =rev*10+re;
			this.rev(n/10);
		}
		return rev;
	}
}