
import java.util.Scanner;

class Bill
{
	
	public void bill()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter last month unit, of bill  ");
		float last_month = sc.nextFloat();    

		System.out.print("Enter current month unit, of bill  ");
		float current_month = sc.nextFloat();          

		float unit = last_month + current_month;
		float amount;
		
		
			 if(unit>0 && unit<=100)
			  {	
				  amount = unit*5;
				  System.out.print("Amount is:  "+amount);
			  } 

			else if(unit>100 && unit<=200)
			  {
				  amount = unit*7.5f;
				  System.out.print("Amount is:  "+amount);
			  }  	  
			else if(unit>200 && unit<=300)  
			  {
				  amount = unit*12.5f;
				  System.out.print("Amount is:  "+amount);
			  }

			else if(unit>300)  
			{	amount = unit*16;
				System.out.print("Amount is:  "+amount);
			}				
	}
	
	public static void main(String[]args)
	{
		Bill ob = new Bill();	
		ob.bill();

	}
	
}