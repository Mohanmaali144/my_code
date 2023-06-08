
import java.util.Scanner;
class Sqr
{  
	public void print_strong()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int count=0,n = sc.nextInt();	
		for(int i=1; ; i++)
		{
			System.out.println(i*i);
			count++;
			if(count==n)
				break;
		}		
	}	
	public static void main(String[]args)
	{
		Sqr ob = new Sqr();
		ob.print_strong();	
	}	
}