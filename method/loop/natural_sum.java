
import java.util.Scanner;

class NaturalSum
{
	
	public void natural()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int n = sc.nextInt();
		int i =1,sum=0;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum = "+sum);
	}
	
	public static void main(String[]args)
	{
		NaturalSum ob = new NaturalSum();	
		ob.natural();

	}	
}