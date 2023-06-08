/*task 03 ____28/04/2023

input character and check there is digit,symbol,Vowels or consonent*/

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);

		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			System.out.println(ch+"  Is Vowel...");
		}
		else if((ch>=0 && ch<48) || (ch>57&&ch<65)||(ch>90 &&ch<97)||(ch>122 &&ch<255))
		{
			System.out.println(ch+"  Is Special Symbol...");
		}
		else if(ch>=48 &&ch<=57)
		{
			System.out.println(ch+"  Is Digit...");
		}

		else if(ch>=65 &&ch<=90||(ch>=97 &&ch<=122))
		{
			System.out.println(ch+" is Consonent");
		}

		else
		{
			System.out.println(ch+"Invalid character !!!");
		}
	}
}