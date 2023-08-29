// A String is Palindrome or Not
import java.util.Scanner;
class Main{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a srring ");
		String str = sc.nextLine();
		
		boolean flag = false;
		for(int i=0,j=str.length()-1;i<str.length()/2; i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag =true;
			}
		
		}
		if(flag)
			System.out.println("not palindrom");
		else
		{
			System.out.println(" palindrom");
		}
	}
}