
import java.util.Scanner;

class Rectangle3
{
	
	public void volume()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenth of rectengal");
		float l = sc.nextFloat();
		System.out.println("Enter with of rectengal");
		float w = sc.nextFloat();
		System.out.println("Enter hight of rectengal");
		float h = sc.nextFloat();
		float v=l*w*h;
		System.out.println("volume  = "+v);
	}
	
	public static void main(String[]args)
	{
		Rectangle3 ob = new Rectangle3();	
			ob.volume();

	}
}