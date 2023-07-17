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
class Dog extends Animal
{
	private String breed; 
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return this.breed;
	}
}

class Main
{
	public static void main(String []arg)
	{
		Dog ob = new Dog();
		ob.setHeight(3.5f);
		ob.setWeight(11.5f);
		ob.setMon("Empty");
		ob.setSound("bhow..bhow..");
		ob.setColor("white");
		ob.setBreed("Herding");
		System.out.println("Height = "+ob.getHeight());
		System.out.println("Weight = "+ob.getWeight());
		System.out.println("Mon = "+ob.getMon());
		System.out.println("Color = "+ob.getColor());
		System.out.println("Sound= "+ob.getSound());
		System.out.println("Breed = "+ob.getBreed());
		
	}
}

