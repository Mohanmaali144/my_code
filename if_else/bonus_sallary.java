/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount*/

import java.util.Scanner;
class Bonus
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter year of service");
	int year = sc.nextInt();
	
	
	
	if(year>=5)
	{   
		System.out.println("Enter your sallary");
		int sallary = sc.nextInt();
		int bonus = (sallary*5)/100;
		sallary = sallary + bonus;
		
		System.out.println("you bonus received:  "+bonus);
		//System.out.println("now your sallary is:  "+sallary);
	
	}
	
	else
	{
		System.out.println("give more time in this company.......\nthank you...");
	}
}
}