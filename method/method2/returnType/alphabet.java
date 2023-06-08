/*Alphabet or not  */
import java.util.Scanner;
class Alphabet
{  
	public boolean isAlpha(char x)
	{		
		return  (x>=65 && x<=90 || x>=97 && x<=122)?true: false  ;
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charecter");
		char ch= sc.next().charAt(0);	
		if((new Alphabet().isAlpha(ch)))	
			System.out.println(ch+" is alphabet");
		else
		 System.out.println(ch+" is not a alphabet");
	}
}
