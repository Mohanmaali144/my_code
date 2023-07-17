//hybrid inheritance

import java.util.Scanner;


class Vehicle {
	String brand,color;
	int price,speed;

	public Vehicle(){
		
	}
	public Vehicle(String brand,String color,int price,int speed) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	public void display()
	{
		System.out.println("Brand = "+this.brand);
		System.out.println("color = "+this.color);
		System.out.println("price = "+this.price);
		System.out.println("speed = "+this.speed);
	}
	public String getBrand() {
		return this.brand;
	}
	public String getColor() {
		return this.color;
	}
	public int getSpeed() {
		return this.speed;
	}
}
class LandTransport extends Vehicle {
	
	int wheel;
	public LandTransport(String brand,String color,int price,int speed,int wheel) {
		
		super(brand,color,price,speed);
		this.wheel = wheel;
	}
	public void display()
	{
		super.display();
		System.out.println("wheel = "+this.wheel);
		
	}

}
interface Advance  {
	
	void increment();
}

class Car extends LandTransport implements Advance {
	
	private int fuelCapacity;
	double fuel;
	
	public void setFuel(double f)
	{
		this.fuel = f/95.0;
	}
	public double getFuel()
	{
		return this.fuel;
	}
	
	Scanner sc = new Scanner(System.in);
		
	public Car (String brand,String color,int price,int speed,int wheel,int fuelCapacity) {
		
		super(brand,color,price,speed,wheel);
		this.fuelCapacity = fuelCapacity;
	}
	
	public void increment() {
		
		System.out.println("Enter Amount for increment fuel ");
		double f = sc.nextDouble();
		
		if((f/95)>45)
		{
			System.out.println("Ammont is high\nfuel Capacity is low ");
		}
		else{
			
			this.setFuel(f);
		}
		System.out.println("fuel in car = "+this.fuel+" ltr");
	}
	public void display()
	{
		super.display();
		System.out.println("fuelCapacity = "+this.fuelCapacity);
		
	}	
}


class CarClint {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand name : ");
		String brand = sc.next();
		System.out.println("Enter Color  : ");
		String color = sc.next();
		System.out.println("Enter price  : ");
		int price = sc.nextInt();
		System.out.println("Enter Speed  : ");
		int speed = sc.nextInt();
		
		System.out.println("Enter wheel  : ");
		int wheel = sc.nextInt();
		System.out.println("Enter Fuel capacity  : ");
		int fuel = sc.nextInt();	
		
		Car ob = new Car(brand,color,price,speed,wheel,fuel);
		System.out.println("\n-----------------------------------------------\n");
		ob.display();
		ob.increment();
		
	}
}
