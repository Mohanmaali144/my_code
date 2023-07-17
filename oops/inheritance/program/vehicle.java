import java.util.Scanner;
abstract class Vehicle 
{
    String name;
    String brand;
    String color;
    int capacity;
    double cost;

    public Vehicle() 
    {
        this.name = "";
        this.brand = "";
        this.color = "";
        this.capacity = 0;
        this.cost = 0.0;
    }

    public Vehicle(String name, String brand, String color, int capacity, double cost)
     {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
    }

    public abstract void drive();

    public abstract void breaK();

    public void display() {
        System.out.println("Name = " + this.name);
        System.out.println("Brand = " + this.brand);
        System.out.println("Color = " + this.color);
        System.out.println("Capacity = " + this.capacity);
        System.out.println("Cost = " + this.cost);
    }
}

abstract class LandTransport extends Vehicle {
    int wheel;
 
    public LandTransport() 
    {
        this.wheel = 0;
    }

     public LandTransport(String name, String brand, String color, int capacity, double cost,int wheel) 
    {
        super(name,brand,color,capacity,cost);
        this.wheel = wheel;
    }

    public LandTransport(int wheel) {
        this.wheel = wheel;
    }
}

class Cycle extends LandTransport {
   
    public Cycle()
    {
        super();
    }
    public Cycle(String name, String brand, String color, int capacity, double cost,int wheel)
    {
        super(name,brand ,color,capacity, cost,wheel);
    }
    public void drive() {
        System.out.println("Cycle is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Bike extends LandTransport {
   
   public Bike()
    {
        super();
    }
    public Bike(String name, String brand, String color, int capacity, double cost,int wheel)
    {
        super(name,brand ,color,capacity, cost,wheel);
    }
    public void drive() {
        System.out.println("Bike is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Car extends LandTransport {
    
    public Car()
    {
        super();
    }
    public Car(String name, String brand, String color, int capacity, double cost,int wheel)
    {
        super(name,brand ,color,capacity, cost,wheel);
    }
    
    public void drive() {
        System.out.println("driving car");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

abstract class WaterTranport extends Vehicle {
    
    public WaterTranport() 
    {
        super();
    }

     public WaterTranport(String name, String brand, String color, int capacity, double cost) 
    {
        super(name,brand,color,capacity,cost);
        
    }
}

abstract class WithPropelos extends WaterTranport {
    int propelos;

    public WithPropelos() {
        this.propelos = 0;
    }

    public WithPropelos(String name, String brand, String color, int capacity, double cost,int propelos) 
    { 
        super(name,brand,color,capacity,cost);
        this.propelos = propelos;
    }
}

class Ship extends WithPropelos {
    
    public Ship(String name, String brand, String color, int capacity, double cost,int propelos) 
    { 
        super(name,brand,color,capacity,cost,propelos);
    }
    public void drive() {
        System.out.println(" Movement of the ship.");
    }
    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Submarin extends WithPropelos {
    
    public Submarin(String name, String brand, String color, int capacity, double cost,int propelos) 
    { 
        super(name,brand,color,capacity,cost,propelos);
    }
    public void drive() {
        System.out.println("Submarin is Drive");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

abstract class WithoutPropelos extends WaterTranport {

    public WithoutPropelos(String name, String brand, String color, int capacity, double cost) 
    { 
        super(name,brand,color,capacity,cost);
    }
}
class Boat extends WithoutPropelos {
  
    public Boat(String name, String brand, String color, int capacity, double cost) 
    { 
        super(name,brand,color,capacity,cost);
    }
   
    public void drive() {
        System.out.println("Boat is Drive");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}


abstract class AirTransport extends Vehicle 
{
    public AirTransport()
    {
        super();
    } 
    
    public AirTransport(String name, String brand, String color, int capacity, double cost) 
    { 
        super(name,brand,color,capacity,cost);
    }
}
class Helicopter extends AirTransport
{
    public Helicopter()
    {
        super();
    }
    
    public Helicopter(String name, String brand, String color, int capacity, double cost) 
    { 
        super(name,brand,color,capacity,cost);
    }
    
    public void drive() {
        System.out.println("Helicopter is flying");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Airoplane extends AirTransport
{
    
    public Airoplane(String name, String brand, String color, int capacity, double cost) 
    { 
        super(name,brand,color,capacity,cost);
    }
    
    public void drive() {
        System.out.println("Airoplane is flying");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Jet extends AirTransport
{
    public void drive() {
        System.out.println("Jet is flying");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
       
       do{
        System.out.println("choice are...");
        System.out.println("1 for Cycle ");
        System.out.println("2 for Bike ");
        System.out.println("3 for Car ");
        System.out.println("4 for Ship ");
        System.out.println("5 for Submarin ");
        System.out.println("6 for Boat");
        System.out.println("7 for Helicopter ");
        System.out.println("8 for Airoplane ");
        System.out.println("9 for Jet ");         
        System.out.println("10 for Exit");
        System.out.println("");
        System.out.println("Enter choice...");    
        
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                Cycle cycle = new Cycle("Cycle","Hero","red", 2,5000.0,2);
                cycle.display();
                cycle.drive();
                cycle.breaK();
            break;
            case 2:
                Bike bike = new Bike("Bike","Apache","Black", 2,250000.0,2);
                bike.display();
                bike.drive();
                bike.breaK();
            break;
            case 3:
               Car car = new Car("Thar","Mahendra","Black", 4,1750000.0,4);
                car.display();
                car.drive();
                car.breaK();
            break;
        }
       }while(choice!=10);
    }
}