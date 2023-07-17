class A
{
int a=6;


	static class B {	
	int a=7;
	A ob6 = new A();
		void display(){
			System.out.println(a);
		}
	}
		
	public static void main(String args[]){
		
		A ob = new A();
		A.B  ob1 = new A.B();
		B.display();
		
	}
}
/* 
class M {
	
	public static void main(String args[]){
		
		A ob = new A();
		A.B  ob1 = new A.B();
		ob1.display();
		
	}
} */