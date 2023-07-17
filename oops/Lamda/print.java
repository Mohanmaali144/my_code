interface MyLamda {

	int display(int x);
}

class MyClass {
	
	public static void main(String []args)
	{
	MyLamda ob = (a)-> (a*a);
		
		System.out.println(ob.display(5));
	}
}