import java.util.Scanner;

class BankAc
{
	private String ac_num,ifsc,bank_name,holder_name,fname;
	private double balance;
	
	public void setAcNum(String ac_num)
	{
		this.ac_num = ac_num;
	}
	public String getAcNum()
	{
		return this.ac_num;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setIfsc(String balance)
	{
		this.ifsc = ifsc;
	}
	public String getIfsc()
	{
		return this.ifsc;
	}
	public void setBankName(String bank_name)
	{
		this.bank_name = bank_name;
	}
	public String getBankName()
	{
		return this.bank_name;
	}
	public void setHolderName(String holder_name)
	{
		this.holder_name = holder_name;
	}
	public String getHolderName()
	{
		return this.holder_name;
	}
	public void setFName(String fname)
	{
		this.fname = fname;
	}
	public String getFName()
	{
		return this.fname;
	}
	
	public void withdraw(double amount)
	{
		System.out.println(amount);
		
		if(this.balance>= amount)
		{
			this.balance -= amount;
		}
		else
		{
			System.out.println("invalid balance ");
		}
	}
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public double getBalance()
	{
		return this.balance;
	}
}
class SavingAc extends BankAc
{
	private 
	public void withdraw(double amount)
	{
		System.out.println(getBalance());
		BankAc ob = new BankAc();
		ob.setData("2628309872",500);
		if((getBalance() - amount)<100)
		{
			System.out.println("minimum balnace required 100/-");
		}
		else
		{
			ob.withdraw(amount);
		}
	}
}
class Main
{
	public static void main(String[]arg)
	{
		SavingAc pun123 = new SavingAc();
		Scanner sc = new Scanner (System.in);
		//pun123.setData("2628309872",500);	
		int choice;
		double amount;
		do{
			System.out.println("\tchoice are...");
			System.out.println("\t1 for check Balance");
			System.out.println("\t2 for deposit amount");
			System.out.println("\t3 for withdraw amount");
			System.out.println("\t4 for Exit");
			System.out.println("\tEnter choice");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					double result = pun123.getBalance();
					System.out.println("Amount = "+result);
				break;
				
				case 2:
					System.out.println("Enter amount for deposit");
					amount = sc.nextDouble();
					pun123.deposit(amount);
				break;
				case 3:
					System.out.println("Enter amount for withdraw");
				    amount = sc.nextDouble();
					pun123.withdraw(amount);					
				break;
			
			}
		}while(choice!=4);	
	}
}