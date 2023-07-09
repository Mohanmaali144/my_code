abstract class Animal
{
	abstract void eat();
	
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("hii Animal");
	}
	public static void main(String []arg)
	{
		Dog ob = new Dog();
		ob.eat();
	}
}
