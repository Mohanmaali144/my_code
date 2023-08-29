class MyRun implements Runnable  {
	
	Thread myOb;
	Thread myOb1;
	public MyRun(String name)
	{
		myOb = new Thread (this,name);
		myOb = new Thread (this,name);
		myOb1 = new Thread (this,name);
		myOb.start();
		myOb1.start();
		myOb1.getName();
	}	
	public void run()
	{
		for (int i=1; i<5;i++)
		{
			System.out.println(i);
		}
	}	
}
class main {
	
	public static void main(String args[])
	{
		MyRun ob = new MyRun("first");
	}
}


