class Daemon extends Thread {
	
	public Daemon ()
	{
		this.start();
	}
	public void run()
	{
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Daemon");
				
			}
		}
		 catch(InterruptedException ref){ System.out.println(ref);}
		
	}
}
class MainClass {
	
	public static void main (String args[])
	{
		Daemon ob = new Daemon();
		System.out.println(ob.getName());
		System.out.println(ob.isDaemon());
		ob.setDaemon(true);
		System.out.println(ob.isDaemon());
	}
}
