// amount counting of bill(last and current month)

import java.util.Scanner;

class Test
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter last month unit, of bill  ");
		float l_m = sc.nextFloat();     //last month = l_m

		System.out.print("Enter current month unit, of bill  ");
		float c_m = sc.nextFloat();          //current month = c_m

		float unit = l_m + c_m;
		float amount;

		if(unit>0)
		   if(unit<=100)
			  {
				  amount = unit*5;
				  System.out.print("Amount is:  "+amount);
			  } 

		if(unit>100)
		   if(unit<=200)
			  {
				  amount = unit*7.5f;
				  System.out.print("Amount is:  "+amount);
			  }  	  
				  
		if(unit>200)
		   if(unit<=300)
			  {
				  amount = unit*12.5f;
				  System.out.print("Amount is:  "+amount);
			  }

			  
		if(unit>300)
		{
			amount = unit*16;
			System.out.print("Amount is:  "+amount);
		}  		  	  
	}
}