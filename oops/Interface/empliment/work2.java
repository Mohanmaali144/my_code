//by super class
 interface A {
	 
	 void display();
	 void show();
	 default void hy()
	 {
		 System.out.println("call hy in A");
	 }
 }
 interface B {
	 
	 default void hy()
	 {
		System.out.println("call hy in B"); 
	 } 
	 
	 
 }
 
 class C implements A,B {
	 
	 public void display(){
		 System.out.println("call Display in A");
	 }
	  public void show(){
		 System.out.println("call Show in A");
	 } 
	 public void hy()
	 {
		 A.super.hy();
	 }
	 public void hy2()
	 {
		 B.super.hy();
	 }
 }
 
 class Main {
	 
	 public static void main(String []args){
		 
		 C ob = new C();
		 ob.display();
		 ob.show();
		 ob.hy();
		 ob.hy2();
		
	 }
 }