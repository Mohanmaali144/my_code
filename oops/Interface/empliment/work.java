//by anonamus class
 interface A {
	 
	 void display();
	 void show();
	 void hy();
 }
 interface B {
	 
	 void hy();
 }
 
 class C implements A,B {
	 
	 public void display(){
		 System.out.println("call Display in A");
	 }
	  public void show(){
		 System.out.println("call Show in A");
	 }
	 public void hy(){
		 System.out.println("call hy in A");
	 }	 	 
 }
 
 class Main {
	 
	 public static void main(String []args){
		 
		 C ob = new C();
		 ob.display();
		 ob.show();
		 ob.hy();
		 
		B ref = new B(){	
			public void hy(){
			System.out.println("call Show in B");
			}
		};
		 ref.hy();
	 }
 }