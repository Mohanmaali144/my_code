class A
{
int a=6;


	class B {	
	int a=7;
	A ob6 = new A();
		void display(){
			System.out.println(ob6.a);
		}
	}
}
class M {
	
	public static void main(String args[]){
		
		A ob = new A();
		A.B  ob1 = ob.new B();
		ob1.display();
		
	}
}