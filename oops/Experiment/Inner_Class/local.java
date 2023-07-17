class A
{
   static int a=10;


	void method()
	{
	
		static class B {	
		static final int a=15;
		A ob6 = new A();
			void display(){
				System.out.println(a);
			}
		}
		B ob9 = new B();
		ob9.display();
	}
}
class M {
	
	public static void main(String args[]){
		
		A ob = new A();
		//A.B  ob1 = new A.B();
		ob.method();
		
	}
}