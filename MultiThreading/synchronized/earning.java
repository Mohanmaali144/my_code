class Earning extends Thread {
	
	int total = 0;
	
	public void run ()
	{
		synchronized(this){
		
			for(int i=1; i<=10; i++)
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
		Earning er = new Earning();	
		er.start();	
		
		 synchronized (er)
		{
			try{
			er.wait();
			System.out.println("Earning = "+er.total);
			}
			catch(InterruptedException e)
			{
				
			}
		} 
		//System.out.println("Earning = "+er.total);
	}
}