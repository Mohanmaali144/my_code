import java.util.Scanner;
import vehiclecar.Car;
class ClientCar
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		Car ob = new Car();
		System.out.println("Enter Price");
		ob.setPrice(sc.nextDouble());
		System.out.println("Enter Brand Name");
		ob.setBrand(sc.next());
		System.out.println("Enter Car Name");
		ob.setName(sc.next());
		System.out.println("Enter Coler");
		ob.setColor(sc.next());
		System.out.println("Enter number plate ");
		ob.setNumPlate(sc.next());
		System.out.println("Enter wheels");
		ob.setWheel(sc.nextInt());
		
		System.out.println("Name = "+ob.getName());
		System.out.println("Brand = "+ob.getBrand());
		System.out.println("Color = "+ob.getColor());
		System.out.println("price = "+ob.getPrice());
		System.out.println("Wheel = "+ob.getWheel());		
		System.out.println("Num Plat = "+ob.getNumPlate());
		
	}
}