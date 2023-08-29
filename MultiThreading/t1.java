class MyThread extends Thread{
	
	public void run()
	{
		System.out.println("------------------------------------6");
		for (int i=0; i<=5;i++)
		{
			
			System.out.println(i+" ")	;		
		}
		System.out.println("------------------------------------7");
	}
}
class Main {
	 public static void main(String args[])
	 {
		MyThread ob1 = new MyThread();
		MyThread ob2 = new MyThread();
		MyThread ob3 = new MyThread();
		MyThread ob4 = new MyThread();
		MyThread ob5 = new MyThread();
			
		
		ob1.start();
		System.out.println("------------------------------------5");
		ob2.start();
		ob3.start();
		ob4.start();
		ob5.start();
		/* System.out.println("------------------------------------1");
		System.out.println("------------------------------------2");
		System.out.println("------------------------------------3");
		System.out.println("------------------------------------4");
		System.out.println("------------------------------------5"); */
	 }
}