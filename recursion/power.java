//complete power using recursion......
import java.util.Scanner;
class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		System.out.println("Enter base");
		int b=sc.nextInt();
		Test ob = new Test();
		System.out.println(n+"^"+b+" = "+ob.pow(n,b));	
	}  	
	public int pow(int n,int b)
	{
		if(b==1)
		{
			return n;
		}
		return  n* pow(n,b-1);
	}
}