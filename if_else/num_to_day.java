
/*task 02 ___28/04/2023
print Name of Day of week if user give input any one digit in 1 to 7;*/

import java.util.Scanner;
class WeekDay
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a num of Day: ");
int num = sc.nextInt();

if(num>0 && num<=7)
{
if(num==1)
System.out.println("MONDAY");

else if(num==2)
	System.out.println("TUESDAY");


else if(num==3)
	System.out.println("WEDNESDAY");

else if(num==4)
	System.out.println("THURSDAY");


else if(num==5)
	System.out.println("FRIDAY");


else if(num==6)
	System.out.println("SATURDAY");


else if(num==7)
	System.out.println("SUNDAY");
}


else
  System.out.println("Invalid number of day..!!.......");
}
}
