interface A {
     String display(String s);
}
class Main {
	
	public static void main(String []args)
	{
		A ob = (s)-> (s+3434);
		System.out.println(ob.display("sd"));			
	}
}