import java.util.Scanner;

class Greatest
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:  ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number:  ");
		int n2 = sc.nextInt();
		System.out.print("Enter third number:  ");
		int n3 = sc.nextInt();
			
		  if(n1==n2 && n2==n3)
			System.out.println("all same");
		
		else if(n1==n2 || n2==n3 || n3==n1)
			System.out.println("any two are same");
				
		else if(n1>n2 && n1>n3)		
			System.out.println(n1+"  is greatest");
		
		else if(n2>n1 && n2>n3)		
			System.out.println(n2+"  is greatest");
		
		else
			System.out.println(n3+"  is greatest");
	}
}