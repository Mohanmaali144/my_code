class MyException



class TicketBook {

	int seat;
	public TicketBook ()
	{}
	public TicketBook (int seat)
	{
		this.seat = seat;
	}
	
	synchronized public void bookNow(int ticket)
	{	
			if(this.seat>=ticket)
			{	
				seat -= ticket;
				System.out.println(ticket + " Seat Successfully booked");
				System.out.println(seat + " Are Available..");
				
				try{
					Thread.sleep(2000);
				}
				catch(Exception e){}
			}
			else
			{
				System.out.println("invalid seat");		
			}
	
	}
}

class MyThread extends Thread {
	
	int ticket;
	TicketBook ref;
	public MyThread (TicketBook ref,int ticket)
	{
		this.ticket = ticket;
		this.ref =  ref;
		this.start();		
	}	
	public void run()
	{
		ref.bookNow(ticket);
	}
}

class Main {
	
	public static void main(String args[])
	{
		
		TicketBook ti = new TicketBook (10);
		
		MyThread ob2 = new MyThread(ti,7);
		MyThread ob1 = new MyThread(ti,5);
		
	}
}