import java.io.*;
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
					
			while(h<24)
			{			
				s++;
				
				System.out.format("\r"+"%02d:%02d:%02d",h,m,s);
				Thread.sleep(100);
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
