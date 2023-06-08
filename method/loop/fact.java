
import java.util.Scanner;

class Fact
{  
	public void fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n= sc.nextInt();
		int fact =1,i=1;
		while(i<=n)
		{
			fact*=i;
			i++;
		}
		System.out.println("Factorial = "+fact);
	}
	
	public void fibonaci()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n= sc.nextInt();
		int i=1,a=0,b=1,c=0;
		while(i<=n)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			i++;
		}	
	}
	
	public void tabel()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n= sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+(n*i));	
			i++;
		}	
	}
	
	public void power()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n= sc.nextInt();
	
		System.out.println("Enter  power");
		int power = sc.nextInt();
		int i=1,pow=1;
		while(i<=power)
		{
			pow = pow*n;
			i++;
		}	
		System.out.println(n+"^"+power+" = "+pow);
	}
		
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choice Are..");
		System.out.println("press 1 for factorial");
		System.out.println("press 2 for fibonaci series");
		System.out.println("press 3 for table");
		System.out.println("press 4 for power");

		System.out.println("Enter choice..");
		int ch = sc.nextInt();
		Fact ob = new Fact();
		switch(ch)
		{
			case 1: 
				ob.fact();
			break;
			
			case 2:
				ob.fibonaci();
			break;
			
			case 3:
				ob.tabel();
			break;
			
			case 4:
				ob.power();
			break;
	
			default:
				System.out.println("invalid choice");
		}
	}	
}