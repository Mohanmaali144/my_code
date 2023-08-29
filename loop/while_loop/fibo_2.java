import java.util.Scanner;
/*fibonaciseries_____08/05/2023____*/
class Fibo2
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term: ");
		int n = sc.nextInt();
		
		int c=0,i=1,a=-1,b=1;	
		while(i<=n)
		{
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;	
			i++;
		}
	}
}