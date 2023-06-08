/* input character and check there are digit, alphabet or Symbol, if they 
are alphabet then check there is vowel or not */ 

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter any character :  ");
char ch = sc.next().charAt(0);                    

//int value = (int)(ch);

if(ch<=57)
	if(ch>=48)
		System.out.print(ch  +"  is Digit");
	
	
/*vowel checking in upper case*/
if(ch<=90)
	 if(ch>=65)
	      if(ch=='A')
			  System.out.print(ch +"  is Vowel");
	       
		   else
		   {
			   if(ch=='E')
				  System.out.print(ch +"  is Vowel");
			   else
			   {
				   if(ch=='I')
					   System.out.print(ch +"  is Vowel");
				   
				   else
				   {
					   if(ch=='O')
						   System.out.print(ch +"  is Vowel");
					   
					   else
					   {
						   if(ch=='U')
							   System.out.print(ch +"  is Vowel");
						   else
						   {
							   System.out.print(ch +"  is Consonent");
						   }
					   }
				   }
			   }
		   }


/*vowel checking in lower case*/
if(ch<=122)
	 if(ch>=97)
	      if(ch=='a')
			  System.out.print(ch +"  is Vowel");
	       
		   else
		   {
			   if(ch=='e')
				  System.out.print(ch +"  is Vowel");
			   else
			   {
				   if(ch=='i')
					   System.out.print(ch +"  is Vowel");
				   
				   else
				   {
					   if(ch=='o')
						   System.out.print(ch +"  is Vowel");
					   
					   else
					   {
						   if(ch=='u')
							   System.out.print(ch +"  is Vowel");
						   else
						   {
							   System.out.print(ch +"  is Consonent");
						   }
					   }
				   }
			   }
		   }
	
		
	/*Symble check*/
if(ch<=47)	
	if(ch>=0)
	 System.out.print(ch +"  Is Special Symbol");
 
 if(ch<=64)	
	if(ch>57)
	 System.out.print(ch +"  Is Special Symbol");
 
 if(ch<=96)	
	if(ch>90)
	 System.out.print(ch +"  Is Special Symbol");
 
 if(ch<=255)	
	if(ch>122)
	 System.out.print(ch +"  Is Special Symbol");
  }
   }