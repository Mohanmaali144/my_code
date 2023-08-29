package vehicledata;
public class Vehicle
{
	private double price;
	private String brand;
	private String color;
	private String name;
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.name;
	}
	public String getColor()
	{
		return this.color;
	}
}


