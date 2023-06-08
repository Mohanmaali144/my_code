/*check Vowel or consonent*/

import java.util.Scanner;

class Vowel
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);


System.out.println("\nEnter a alphabet" );
char ch = sc.next().charAt(0);

if((ch>=65 && ch<=90)||(ch>=97&&ch<=122))
{
switch(ch)
{
	case 'a':
	    System.out.println("Vowel" );
	break;	
	
	case 'A':
	    System.out.println("Vowel" );
	break;
	
	case 'e':
	    System.out.println("Vowel" );
	break;
	
	case 'E':
	    System.out.println("Vowel" );
	break;
	
	case 'i':
	    System.out.println("Vowel" );
	break;	
	
	case 'I':
	    System.out.println("Vowel" );
    break;
	
	case 'o':
	    System.out.println("Vowel" );
	break;
	
	case 'O':
	    System.out.println("Vowel" );
	break;
	
	case 'u':
	    System.out.println("Vowel" );
    break;
	
	case 'U':
	    System.out.println("Vowel" );
	break;
	
	default:
		 System.out.println("Consonent" );
}		 
}
else{
	System.out.println("not a alphabet" );
}

}}