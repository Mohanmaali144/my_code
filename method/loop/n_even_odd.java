
import java.util.Scanner;

class Even
{  
	public void even()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i =1;
		while(i<=n)
		{	
			System.out.print((i*2)+" ");
		i++;
		}	
	}
	
		
	public static void main(String[]args)
	{
		Even ob = new Even();	
		ob.even();	
	}	
}