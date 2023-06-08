
// print Name and day of MONTH  if user give input any one NUMBER in 1 to 12;
import java.util.Scanner;
class MonthDay
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a num of Day: ");
int num = sc.nextInt();

if(num==1)
{
System.out.println("JANUARY : 31");
}

if(num==2)
{
System.out.println("FABUARY : 28 0R 29");
}

if(num==3)
{
System.out.println("MARCH : 31");
}

if(num==4)
{
System.out.println("APRIL : 30");
}

if(num==5)
{
System.out.println("MAY : 31");
}

if(num==6)
{
System.out.println("JUNE : 30");
}

if(num==7)
{
System.out.println("JULY : 31");
}

if(num==8)
{
System.out.println("AUGUST : 31");
}

if(num==9)
{
System.out.println("SEPTEMBER : 30");
}

if(num==10)
{
System.out.println("OCTOBER: 31");
}

if(num==11)
{
System.out.println("NOVEMBER : 30");
}

if(num==12)
{
System.out.println("DECEMBER : 31");
}

if(num>12)
{
	System.out.println("INVALID MONTH !!!!!");
}
if(num<1)
{
	System.out.println("INVALID MONTH !!!!!");
}
}
}