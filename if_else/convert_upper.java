// input char and convert lower to upper and upper to lower case

import java.util.Scanner;

class Test
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character:  ");
		char ch = sc.next().charAt(0);
			if(ch>=65)
			   if(ch<=90)
			   {	
			  int t = (int)(ch+32);
			  char ans=(char)(t);
			  System.out.print(ans);
			   }
			else
			{
				if(ch>=97)
			if(ch<=122)
			{	
			  int t = (int)(ch-32);
			  char ans=(char)(t);
			  System.out.print(ans);
			}
			else{System.out.print("Not a Alphabet");}
				
			}
			
	}
}