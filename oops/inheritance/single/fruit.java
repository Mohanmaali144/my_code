//single
import java.util.Scanner;
class Fruit
{
	String test,color;
	double price;
	public void setTest(String test)
	{
		this.test = test;
	}
	public String getTest()
	{
		return this.test;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
}
class Apple extends Fruit
{
	private String type;
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;	
	}
}

class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		Apple ob = new Apple();
		
		ob.setTest("Sweet");		
		ob.setColor("yellow-orange");
		ob.setPrice(160);
		ob.setType("Gala-Apple");
		
		System.out.println(" Type = "+ob.getType());
		System.out.println(" Color = "+ob.getColor());
		System.out.println(" Test = "+ob.getTest());
		System.out.println(" price = "+ob.getPrice()+"₹kg");
		
	}
}