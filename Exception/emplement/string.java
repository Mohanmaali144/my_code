import java.util.Scanner;

class Test {
	public static void main(String args[])
	{
		Test ob = new Test();
		System.out.println("Ans = "+ob.takeInput());
	}
	
	public int takeInput(){	
		Scanner sc = new Scanner (System.in);
			
		try{
			
			System.out.println("Enter a number ");
			int a = sc.nextInt();	
		}
		catch(InputMismatchException ref)
		{
			return 0;
		}
			return 1;
		
	}
}