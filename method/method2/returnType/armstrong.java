// ucomplete.....
import java.util.Scanner;
class Armstrong
{  
	public boolean isArm(int x)
	{	
		int i;
		for(i=2; i<x; i++)
			if(x%i==0)
				break;
		if(i==x)
			System.out.println("true");
		else
			System.out.println("false");
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		Armstrong ob = new Armstrong();
		ob.isSrm(n);		
	}	
}