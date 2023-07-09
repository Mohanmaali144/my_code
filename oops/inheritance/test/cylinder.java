
//cylinder
import java.util.Scanner;

class Area
{
	double r;
	
	public void setData(double r)
	{
		this.r = r;
	}
	public double area()
	{	
		return 2*3.14f*r+2*3.14f*(r*r);
	}
}
class Volume extends Area
{
	private double h;
	public void setData(double r,double h)
	{
		this.setData(r);
		this.h = h;
	}
	public double volume()
	{
		return 3.14f*(this.r*this.r)*this.h;
	}	
}

class Main
{
	public static void main(String []args)
	{
		Volume ob = new Volume();
		ob.setData(12.3);
		System.out.println(ob.area());
		
	}
}