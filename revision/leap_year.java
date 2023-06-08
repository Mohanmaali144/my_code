import java.util.Scanner;

class LeapYear
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year:  ");
		int year = sc.nextInt();
		
		if(year%400==0 ||(year%4==0 && year%100!=0))
			System.out.print(year+"  Leap year");
		
		else
		System.out.print(year+" Not Leap year");
}}		