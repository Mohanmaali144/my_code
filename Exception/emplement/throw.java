 
 
 class Test {
     
	 public void print() 
	 {
		int a=0;
		try
		{         
			System.out.println("try block");   
			a =2;
			throw new Exception();
		}
		 catch (Exception ref)
		 {      
			System.out.println("catch block ");
			a++;
		 } 
		 finally 
		 {
			 System.out.println(a);
		 }
	 }
	 public static void main(String[] args) {
		
		new Test().print();
	 }
 }