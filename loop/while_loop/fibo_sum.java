import java.util.Scanner;
class FiboSum
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term: ");
		int n = sc.nextInt();	
		int fibo=0,i=1,a=0,b=1,sum=0;	
		while(i<=n)
		{	
			System.out.print(fibo+" ");
			sum=sum+fibo;
			if(i<n)
				System.out.print(" + ");
			a=b;
			b=fibo;
			fibo = a+b;
			i++;
		}
		System.out.print(" = "+sum);
	}
}