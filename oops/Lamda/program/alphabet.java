import java.util.Scanner;

interface Alphabet {
	
	String checkAlpha(char ch);
}
class Main {
	
	public static void main(String []args)
	{	
		Scanner sc = new Scanner(System.in);
		Alphabet ob =(ch) -> (ch>=65&&ch<=90||ch>=97&&ch<=122 ?"   Alphabet":"  Not Alphabet");
		
		System.out.print("Enter any character :  ");
		char ch = sc.next().charAt(0) ;
		System.out.print(ob.checkAlpha(ch));
	}
}