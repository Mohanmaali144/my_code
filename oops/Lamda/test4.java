interface A {
     void display(String s);
}
class Main {
	
	public static void main(String []args) {
		
		A ob = (s)-> {System.out.println("display");};
		ob.display("string");			
	}
}
