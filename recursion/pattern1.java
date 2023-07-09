/*	*
	* *
	* * *
	* * * *
	* * * * *
*/
import java.util.Scanner;
class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();
		
		for(int i=1; i<=n;i++)
		{	
			ob.triangle(i);
			System.out.println("");
		}	
	}	
	public void triangle(int n)
	{
		if(n>0)
		{
			System.out.print("* ");
			this.triangle(n-1);	
		}
	}
}