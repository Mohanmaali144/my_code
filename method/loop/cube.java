
import java.util.Scanner;
class Cube
{  
	public void print_cube()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int count=0,n = sc.nextInt();	
		for(int i=1; ; i++)
		{
			System.out.println(i*i*i);
			count++;
			if(count==n)
				break;
		}		
	}	
	public static void main(String[]args)
	{
		Cube ob = new Cube();
		ob.print_cube();	
	}	
}