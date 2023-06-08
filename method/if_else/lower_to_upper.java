
import java.util.Scanner;

class LowerToUpper
{
	
	public void lower_to_upper()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character:  ");
		char ch = sc.next().charAt(0);
		
		if(ch>=97 && ch<=122)
		{
			int temp = (int)(ch-32);
			char ans=(char)(temp);
			System.out.print(ans);
		}
		else if(ch>=65 && ch<=90)
			System.out.print("allready in Upper Case ");
		else
			System.out.print("not a Alphabet ");
	}
	
	public static void main(String[]args)
	{
		LowerToUpper ob = new LowerToUpper();	
		ob.lower_to_upper();

	}
	
}