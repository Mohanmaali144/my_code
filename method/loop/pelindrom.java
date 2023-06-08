
import java.util.Scanner;

class Pelindrom
{  
	public void pelindrom()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num,rev=0 ;
		while(num>0)
		{
			int re = num%10;
			rev = rev*10+re;
			num/=10;

		}
		if(temp==rev)
			System.out.println(temp+" is pelindrom");
		
		else
			System.out.println(temp+" is not pelindrom");
	}
	
		
	public static void main(String[]args)
	{
		Pelindrom ob = new Pelindrom();
		ob.pelindrom();	
	}	
}