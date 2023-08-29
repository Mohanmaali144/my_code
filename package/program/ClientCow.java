import java.util.Scanner;
import animalcow.Cow;

class ClientCow
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

