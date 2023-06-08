
import java.util.Scanner;

class UpperToLower
{
	
	public void upper_to_lower()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character:  ");
		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			int temp = (int)(ch+32);
			char ans=(char)(temp);
			System.out.print(ans);
		}
		else if(ch>=97 && ch<=122)
			System.out.print("allready in lower Case ");
		else
			System.out.print("not a Alphabet ");
	}
	
	public static void main(String[]args)
	{
		UpperToLower ob = new UpperToLower();	
		ob.upper_to_lower();

	}
	
}