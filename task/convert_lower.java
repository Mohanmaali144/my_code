// input char and convert in upper case

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any character:  ");
char ch = sc.next().charAt(0);

    if(ch>=97)
	 {   if(ch<=122)
	      {	
           int t = (int)(ch-32);
           char ans=(char)(t);
           System.out.print(ans);
	      }
	  else{System.out.print("Not a lower case or Alphabet");}
		
	}
	
}
}