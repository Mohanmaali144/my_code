//single
import java.util.Scanner;
static class Mobile
{
	protected String brand,color;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public void setColor (String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}	
}
class Android extends Mobile
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
		Android ob = new Android ();
		ob.setBrand("Semsung");
		ob.setColor("White");
		ob.setCamera(54);
		ob.setStorage(128);
		ob.setLock("Finger-print");
		System.out.println("Brand : "+ob.getBrand());
		System.out.println("Color : "+ob.getColor());
		System.out.println("Camera : "+ob.getCamera()+" MF");
		System.out.println("Storage : "+ob.getStorage()+" GB");
	}
}