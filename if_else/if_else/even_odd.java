// Even or odd number using ______if ________
import java.util.Scanner;

class Test
{

	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(num%2==0)
		System.out.println(num + "  is Even number");	   
		else{
		System.out.println(num  +"  is odd number");
		}
	}
}