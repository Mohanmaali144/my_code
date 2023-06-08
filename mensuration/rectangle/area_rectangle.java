
//area of rectangle


import java.util.Scanner;

class Rectangle
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter lenth: " );
		int lenth = sc.nextInt();
		System.out.print("Enter width: ");
		int width = sc.nextInt();
		int area = lenth*width;
		System.out.print("Area of rectangle : "+area);
	}
}
