import java.util.Scanner;
class Hcf
{
	public static void main(String[]arg)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:   ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:   ");
		int n2 = sc.nextInt();
		while(n1!=n2)
		{
			if(n1<n2)
			{
				n2=n2-n1;
			}
			else
			{
				n1=n1-n2;
			}
		}
	   int hcf=n1;
	   System.out.println("Hcf = "+hcf);
 
	}	
}