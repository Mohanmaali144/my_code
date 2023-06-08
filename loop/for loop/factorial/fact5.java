// 1!/1 - 2!/2 + 3!/3 - 4!/4 + 5!/5 = 20
import java.util.Scanner;
class Fact5
{
	public static void main(String[]arg)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int fact=1,i,sum=0;
		for(i=1; i<=n; i++,fact*=i)
		{
			if(i%2==0)
			{
				sum-=(fact/i);
				if(i>1)
				System.out.print(" - ");
				System.out.print(i+"!/"+i);
			}
			else
			{
				sum+=(fact/i);
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+i);
			}
		}
		
		System.out.println(" = "+sum);
	}
}