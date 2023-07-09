// valid triangle
import java.util.Scanner;
class Triangle
{
	private int side1,side2,side3;
	
	public void setData(int side1,int side2,int side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public void getData()
	{
		System.out.println("side1 = "+this.side1+"\nside2 = "+this.side2 +"\nside3 = "+this.side3);
	}
	public void isValid()
	{
		int total = this.side1+this.side2+this.side3;
		if(total==180)
		{
			System.out.println("valid triangle");		
		}
		else
		{
			System.out.println("invalid triangle");
		}
	}
	public void isValid(int side1,int side2,int side3)
	{
		int total = side1+side2+side3;
		if(total==180)
		{
			System.out.println("valid triangle");		
		}
		else
		{
			System.out.println("invalid triangle");
		}
	}
}

class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three side of triangle");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		Triangle ob = new Triangle();
		ob.isValid(side1,side2,side3);
		ob.getData();
	}
}
