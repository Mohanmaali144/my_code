// Shap
import java.util.Scanner;
abstract class TwoD
{
	abstract double area();
}
class Circle extends TwoD
{
	int a;
	public Circle()
	{
		this.a = 0;
	}
	
	public Circle(int a)
	{
		this.a = a;
	}

	public double area()
	{
		return 3.14 *(this.a*this.a);
	}
	public double perimeter()
	{
		return 2*3.14*this.a;
	}
}
class Square extends Circle
{
	public double area()
	{
		return this.a*this.a;
	}
	public double perimeter()
	{
		return 4*this.a;
	}
}
class Rectangle extends Circle
{
	int l;
	public Rectangle()
	{
		this.l = 0;
	}
	public Rectangle(int l,int a)
	{
		super(a);
		this.l = l;
	}
	public double perimeter()
	{
		return 2*(this.l+this.a);
	}
	public double area()
	{
		return this.a*this.l;
	}
}
abstract class Triangle extends TwoD
{
	// continue......
}
class Main
{
	public static void main(String[] args) {
		
		Circle ob = new Circle(4);
		System.out.println("Area  = "+ob.area());
	}
}

