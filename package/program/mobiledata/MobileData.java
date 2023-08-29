package mobiledata;
public class MobileData
{
	private String brand;
	private String color;
	private float length;
	private float weight;
	private double price;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setPrice (double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setColor (String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setLength (float length)
	{
		this.length = length;
	}
	public float getLength()
	{
		return this.length;
	}
	public void setWeight (float weight)
	{
		this.weight = weight;
	}
	public float getWeight()
	{
		return this.weight;
	}
}