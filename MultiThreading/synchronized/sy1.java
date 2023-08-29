//Synchronized method 

class ThreadClass {
	
	synchronized public void test (String msg)
	{
		System.out.print("India is a "+msg);
			
		try {
			Thread.sleep(2000);
		}	
		
		catch (Exception ref)
		{}
		System.out.println(" Country");
	}
}
class ChildThread extends Thread {
	
	String message;
	ThreadClass tob;
	public ChildThread (ThreadClass tob , String msg)
	{
		this.tob = tob;
		this.message=msg;
		this.start();
	}
	public void run ()
	{
		tob.test(message);
	}
}
class Main {
	public static void main (String []args)
	{
		ThreadClass ts = new ThreadClass ();
		
		ChildThread ob1 = new ChildThread(ts,"Great");
		ChildThread ob2 = new ChildThread(ts,"good");
	}
}