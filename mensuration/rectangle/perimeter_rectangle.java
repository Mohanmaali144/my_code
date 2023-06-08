
//perimeter of rectangle


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
		int p = 2*(lenth+width);
		System.out.print("perimeter of rectangle : "+p);
	}
}
