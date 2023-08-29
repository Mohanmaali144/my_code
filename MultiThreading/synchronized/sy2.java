
//Synchronized block
class ThreadClass {

	 public void test (String msg)
	{
		
		System.out.print("Indore is a "+msg);
		try {
			
			Thread.sleep(2000);
		}
		catch (Exception ref)
		{}
		
		System.out.println(" city");
	}
}	
class ChildThread extends Thread {

	
	String message;
	ThreadClass tob;
	
	public ChildThread(ThreadClass tob, String msg)
	{
		this.tob=tob;
		this.message = msg;
		this.start();
	}
	public void run ()
	{
		synchronized(tob){
		
		tob.test(message);
		}
	}
}

class Main{
	
	public static void main (String []args)
	{
		 ThreadClass ts = new  ThreadClass();
		
		ChildThread ob1 = new ChildThread(ts,"clean");
		ChildThread ob2 = new ChildThread(ts,"big");
	}
}