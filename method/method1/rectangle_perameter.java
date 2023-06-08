
import java.util.Scanner;

class Rectangle2
{
	
	public void perameter()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter lenth: " );
		int lenth = sc.nextInt();
		System.out.print("Enter width: ");
		int width = sc.nextInt();
		int p = 2*(lenth+width);
		System.out.print("perimeter of rectangle : "+p);	
	}
	
	public static void main(String[]args)
	{
		Rectangle2 ob = new Rectangle2();	
			ob.perameter();

	}
}