/* Check age of child, teen, young and old */

import java.util.Scanner;

class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age");
		int age = sc.nextInt();

		if(age<=0)
		  System.out.println("Invalid age !!!");
		 
		else
		{
			if(age<13)
			  System.out.println("child age");
			else{
				  if(age<20)
					System.out.println("teen age");
				
				  else
				  {
					  if(age<60) 
						 System.out.println("Young age");
					
					  else
						{
						  System.out.println("Old age");
						}
				  }
			   }
		}

	}
}