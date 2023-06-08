// input number and check positive or negative

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter num:  ");
int num = sc.nextInt();
 
 if(num<0)
    System.out.print(num +"   is Negative number");
 else
   {
	  if(num==0)
		System.out.print(num+"  Zero");
	
	  else
	  {
		System.out.print(num+"  is Positive");
	  }
   }
   
 }
 }
 