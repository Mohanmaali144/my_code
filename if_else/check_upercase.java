/* task __04____28/04/2023

program to check  character is uppercase or lowercase alphabet.*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Alphabet:  ");
	char ch = sc.next().charAt(0);

	if(ch>=65 && ch<=90)
	{
		System.out.println(ch +"  Is Uper case ");
	}
	else if(ch>=97 && ch<=122)
	{
		System.out.println(ch +"  Is lower case ");
	}	
	else
	{
		System.out.println(ch +"  Is Not a Alphabet");
	}
}
}