class MyThread extends Thread {

	
	public MyThread()
	{
		this.start();
	}
	public void run()
	{
		try {
			int s=0;
			int m=0;
			int h=0;
			m=(s*60);
			h=(m*60);
			for(;s<60;s++) {
			Thread.sleep(100);
			System.out.println("hour: "+h +"   minut: "+m+"   second: "+s);
			}
			
		}
		catch( InterruptedException ref )
		{
			
		}
	}
}
class Main{
	public static void main(String args[])
	{
		MyThread h = new MyThread();
		/* MyThread m = new MyThread();
		MyThread s = new MyThread(); */
		
	}
}
