class InsufficientException extends Exception{

	public InsufficientException(){}
	
	public InsufficientException(String msg)
	{
		super(msg);
	}
}
class Bank {
		private double balance = 10000;
	
		public void deposit(double ammount)
		{
			this.balance = this.balance + ammount;
		}	
		public void withdrawal(int ammount)
		{
			try				
				{
					if(ammount>this.balance)
					{ 
						throw new InsufficientException(" your account dose not have sufficient balance ");
					}
					else if(ammount<0)
					{
						throw new InsufficientException(" < 0 is invalid Ammount");
					}
					else
					{
						this.balance = (this.balance-ammount);
						System.out.println("balance = "+ this.balance);
					}
				}
				catch(InsufficientException ref)
				{
					System.out.println(ref);
				}
				
				System.out.println("continue..");
		}	
}

class Main {
	public static void main(String []args)
	{
		int ammount = Integer.parseInt(args[0]);
		
		Bank ob = new Bank();
		
		//ob.diposit(ammount);
		ob.withdrawal(ammount);
	}
	
}