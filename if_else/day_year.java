// input day and print there year,month,week and day

import java.util.Scanner;
class Test
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter day:  ");
		int day = sc.nextInt();		 
		 int year = day/365;
		 day = day%365;
		  
		int month = day/30;
		day = day%30;

		int week = day/7;
		day = day%7;

		System.out.println("Year is:  "+ year);
		System.out.println("month is:  "+ month);
		System.out.println("Week is:  "+ week);
		System.out.println("Day:  "+day);

	}
}