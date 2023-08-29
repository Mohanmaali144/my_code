//bank
import java.util.Scanner;
class Bank {

	double balance;
	
	public Bank (){}
	public Bank (double balance)
	{
		this.balance = balance;
	}
	public void deposit (double amount)
	{
		this.balance +=amount;
		
		System.out.println("|  Ammount : "+amount);
		System.out.println("|  balance : "+this.balance);
	}
	//synchronized
	 synchronized public void withdrawl (double amount) 
	{	
		try{
			if(amount<=this.balance)
			{
				this.balance-=amount;			
				System.out.println("\nwithdrawl : "+amount);
				System.out.println("balance : "+this.balance);
				Thread.sleep(2000);
			}	
			else
			{
				System.out.println("\nInsufficient balance");
			}
		}
		catch(Exception ref){}		
	}
}

class MyThread extends Thread
{
	public MyThread (){}
	
	Bank tob;
	double amount;
	
	public MyThread (Bank tob,double amount){
		
		this.tob = tob;
		this.amount=amount;
		this.start();
	}
	
	public void run()
	{	
		tob.withdrawl(amount);	
	}
}

class MainClass {

	public static void main(String args[])
	{
		Bank bn = new Bank(20000.0);
		
		MyThread gpay = new MyThread(bn,1050);	
		MyThread ppay = new MyThread(bn,10000);
		MyThread paytm = new MyThread(bn,5000);
		MyThread pb = new MyThread(bn,19000);
		MyThread cc = new MyThread(bn,5000);		
	}
}
