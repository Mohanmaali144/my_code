/*product/factorial*/
import java.util.Scanner;
class FactSum
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int i=1,pro=1,sum=0;

		while(i<=n)
		{
			pro *=i;
			sum+=pro;
			
			if(i<n)
			{
			System.out.print(pro+"+");
			}
			i++;
		}
		System.out.println(pro+" = "+sum);
	}
}