
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
					
			while(true)
			{			
				s++;			
				System.out.println("hour: "+h +"   minute: "+m+"   second: "+s+"\r");	
				Thread.sleep(1000);
				//System.out.flush();				
				if(s==60)
				{
					s=0;
					m++;
				}
				if(m==60)
				{
					m=0;
					h++;						
				}
			}		
		}
		catch( InterruptedException ref ){}
	}
}
class MainClock{
	public static void main(String args[])
	{		
		MyThread h = new MyThread();		
	}
}
