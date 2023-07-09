class Cons
{
	static int count =0;
	public Cons()
	{
		count++;
	}	
}
class Main
{
	public static void main(String []args)
	{
		Cons ob = new Cons();	
		Cons ob1 = new Cons();	
		Cons ob2 = new Cons();
		Cons ob3 = new Cons();
		Cons ob4 = new Cons();
		System.out.println("object in this program are... "+Cons.count);
	}
}