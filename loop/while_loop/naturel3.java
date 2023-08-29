import java.util.Scanner;
class Naturel
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number number:   ");
		int n = sc.nextInt();
		int sum =0;
		int i=1;
			System.out.print("Sum of naturel is: ");
			while(i<=n)
			{	
			 sum=sum+i;
			 System.out.print(i);
			 if(i!=n)
			 {
				 System.out.print("+");
			 }		 
			 i++;
			}
			System.out.print(" = "+sum);
	}
}