// check greatest num in four word

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Four number:   ");
int a = sc.nextInt();  
int b = sc.nextInt(); 
int c = sc.nextInt(); 
int d = sc.nextInt();    

if(a>b)
{
	if(a>c)
	  {
		  if(a>d)
			System.out.println(a +"  is greatest.... ");  
		  else
			  System.out.println(d +"  is greatest.... ");
	  }
	else
	{
		if(c>d)
	       System.out.println(c +"  igreatest.... ");
       
	    else
		   System.out.println(d +"  igreatest.... ");
   }		 
	  
}

else
   {
	if(b>c)
	  {
		  if(b>d)
			System.out.println(b +"  is greatest.... ");  
		  else
			  System.out.println(d +"  is greatest.... ");
	  }
	else
	{
		if(c>d)
	       System.out.println(c +"  igreatest.... ");
       
	    else
		   System.out.println(d +"  igreatest.... ");
   }		 
	  
  }

}
}