import java.util.Scanner;

class Main{

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number ");		
		 int a = sc.nextInt();
		 System.out.println("Enter second  number ");
		 int b = sc.nextInt();
		 
		 try {
			 int c = a/b;
			 System.out.println(c);	 
		 }
		 catch (ArithmeticException ref)
		 {
			 System.out.println("the value of b never be zero");	 
		 }
		 System.out.println("continue...");	 
	}
}