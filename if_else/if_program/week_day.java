
// print Name of Day of week if user give input any one digit in 1 to 7;
import java.util.Scanner;
class WeekDay
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a num of Day: ");
int num = sc.nextInt();

if(num==1)
{
System.out.println("MONDAY");
}

if(num==2)
{
	System.out.println("TUESDAY");
}

if(num==3)
{
	System.out.println("WEDNESDAY");
}

if(num==4)
{
	System.out.println("THURSDAY");
}

if(num==5)
{
	System.out.println("FRIDAY");
}

if(num==6)
{
	System.out.println("SATURDAY");
}

if(num==7)
{
	System.out.println("SUNDAY");
}

if(num>7)
{
	System.out.println("INVALID DAY !!!!!");
}
if(num<1)
{
	System.out.println("INVALID DAY !!!!!");
}
}
}