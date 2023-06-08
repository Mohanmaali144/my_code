import java.util.Scanner;

class divisible
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:  ");
		int n = sc.nextInt();
		
		if(n%5==0 && n%11==0)
		{
			System.out.println("\tdvisible");
		}
		else
		{
			System.out.println("\tNot dvisible");
		}
	}
}