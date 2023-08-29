//synchronized method

class MyThread implements Runnable {
	
	String message;
	 Test tob;
	 Thread ob;
	public MyThread (Test tob,String msg )
	{
		this.message = msg;
		this.tob = tob;
		ob = new Thread (this,msg);
		ob.start();
	}
	
	public void run ()
	{
		synchronized(tob){ tob.test(message);}
	}
}

class Test {
	
	synchronized public void test (String msg) //synchronized
	{
		
		System.out.print("Khategaon is very "+msg);
		try{
			Thread.sleep(2000)	;
			
		}
		catch(Exception ref){}
		
		System.out.println(" city");
	
	}	
}
class MainC {
	
	public static void main (String args[])
	{
		Test ts = new Test();
		
		MyThread ob1 = new MyThread(ts,"Small");
		MyThread ob2 = new MyThread(ts,"clean");
	}
}