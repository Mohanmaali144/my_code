/*	* * * * *
	* * * *
	* * *
	* *
	*			
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
			ob.triangle(n-i);
			System.out.println("");
		}	
	}	
	public void triangle(int n)
	{
		if(n!=0)
		{
			this.triangle(n-1);	
		}
		System.out.print("* ");
	}
}