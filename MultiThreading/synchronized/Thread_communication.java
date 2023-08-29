class MyThread extends Thread {
	
	
	
	public MyThread()
	{
		this.start();
	}
	
	public void run ()
	{
		.test();
	}
}

class Test{
	
	public void test ()
	{
		synchronized(this){
		
			for(int i=1; i<=500; i++)
			{
				total = total+10;
			}
			this.notify();
		}
	}
	
}
class Main {
	
	public static void main(String []args)
	{
		MyThread ob = new MyThreads();
		//MyThread ob2 = new MyThreads();			
		 synchronized (er)
		{
			try{
			er.wait();
			MyThread ob2 = new MyThreads();	
			}
			catch(InterruptedException e)
			{
				
			}
		} 
	}
}