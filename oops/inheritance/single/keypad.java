//single
import java.util.Scanner;
class Mobile
{
	String brand,color;
	float length;
	double price;
	
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
	
}
class KeyPad extends Mobile
{
	private int camera;
	private float storage;
	private String lock;
	public void setCamera(int camera)
	{
		this.camera = camera;
	}
	public int getCamera()
	{
		return this.camera;
	}
	public void setStorage(float storage)
	{
		this.storage = storage;
	}
	public float getStorage()
	{
		return this.storage;
	}
	public void setLock(String lock)
	{
		this.lock = lock;
	}
	public String getLock()
	{
		return this.lock;
	}
}

class Main 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		KeyPad ob = new KeyPad();
		System.out.println("Enter price of mobile");
		ob.setPrice(sc.nextDouble());
		System.out.println("Enter brand name");
		ob.setBrand(sc.next());
		System.out.println("Enter length ");
		ob.setLength(sc.nextFloat());
		System.out.println("Enter Color ");
		ob.setColor(sc.next());
		System.out.println("Enter Camera mf");
		ob.setCamera(sc.nextInt());	
		System.out.println("Enter Storage ");
		ob.setStorage(sc.nextFloat());	
		System.out.println("Enter lock type");
		ob.setLock(sc.next());
		System.out.println("Brand : "+ob.getBrand());
		System.out.println("Color : "+ob.getColor());
		System.out.println("Camera : "+ob.getCamera()+" MF");
		System.out.println("Storage : "+ob.getStorage()+" GB");
		System.out.println("Length : "+ob.getLength()+" Inch");
		System.out.println("Price : "+ob.getPrice()+" /-");
	}
}