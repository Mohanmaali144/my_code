import java.util.Scanner;
import animaldog.Dog;

class ClientDog
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

