// Inheritance
class Animal 	//	Super class(Parent class)	
{
	public void eat()
	{
		System.out.pribntln("I am eating ");
	}
}
class Dog extends Animal	//Dog :-	Sub class(Child class)
{
	public static void main(String[]args)
	{	
		System.out.println("I am Dog class ");
		Dog d = new Dog();
		d.eat();
	}
}
