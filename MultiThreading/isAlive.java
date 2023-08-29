class MyThread extends Thread
{
	public MyThread()
	{
		this.start();
	}
	
	public void run()//throws InterruptedException ref
	{
		try{
			for(int i=1;i<=5;i++ )
			{
				Thread.sleep(1000);
				System.out.println("nitin");
			}
		}
		catch(InterruptedException ref)
		{
			
		}
	}
}
class Main {
	
	public static void main (String args[])
	{
		MyThread ob = new MyThread();
		System.out.println(ob.isAlive());
	}
}