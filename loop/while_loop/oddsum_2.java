import java.util.Scanner;
class OddSum2
{
	public static void main(String[]arg)
		{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		int i=1;
		int ans=0;
		int sum=0;
			System.out.print("Odd num is: ");
		while(i<=n)
		{		 
		ans = i*2-1;
		sum=sum+ans;
		   if(i<n)
		   {
			  System.out.print(ans+" + "); 
		   }
			 
		 i++;
		}
		System.out.print(ans+" = "+sum);
		}
}