class MyThread extends Thread {
	
	public void run ()
	{
		try{
			
			for(int i=1; i<=5;i++){
			System.out.println("nitin");
			Thread.sleep(10000);
		}
		}
		catch(InterruptedException ref)
		{
			ref.printStackTrace();
		}
	
	}
}
class Main {
	
	public static void main(String []args)
	{
		MyThread ob1 = new MyThread();
		MyThread ob2 = new MyThread();
		MyThread ob3 = new MyThread();
		
		ob1.start();
		/* ob2.start();
		ob3.start(); */
	}
}

