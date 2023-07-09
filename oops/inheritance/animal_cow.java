//single
import java.util.Scanner;
class Animal
{
	float height;
	float weight;
	String mon,sound,color;
	
	public void setHeight(float height)
	{
		this.height = height;
	}
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	public void setMon(String mon)
	{
		this.mon = mon;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setSound(String sound)
	{
		this.sound = sound;
	}
	
	public float getHeight()
	{
		return this.height;
	}
	public float getWeight()
	{
		return this.weight;
	}
	public String getMon()
	{
		return this.mon ;
	}
	public String getColor()
	{
		return this.color;
	}
	public String getSound()
	{
		return this.sound;
	}
}
class Cow extends Animal
{
	private String breed; 
	private String tail;
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return this.breed;
	}
	public void setTail(String tail)
	{
		this.tail = tail;
	}
	public String getTail()
	{
		return this.tail;
	}
}

class Main
{
	public static void main(String []arg)
	{
		Cow ob = new Cow();
		ob.setHeight(6.5f);
		ob.setWeight(90.5f);
		ob.setMon("Grass");
		ob.setSound("Moo");
		ob.setColor("Black");
		ob.setBreed(" Badri-cow");
		ob.setTail("Long");
		System.out.println("Height = "+ob.getHeight()+" feet");
		System.out.println("Weight = "+ob.getWeight()+" kg");
		System.out.println("Mon = "+ob.getMon());
		System.out.println("Color = "+ob.getColor());
		System.out.println("Sound = "+ob.getSound());
		System.out.println("Breed = "+ob.getBreed());
		System.out.println("Tail = "+ob.getTail());	
	}
}

