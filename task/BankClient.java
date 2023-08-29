/*bank Account*/
import java.util.Scanner;

class BankData {

    private int acNum;
    private String branch;
    private double balance;
    private String name ;
    private String acType;
    private String bankName;
	
	/*-------------cunstructor-----------------------*/
    public BankData(int acNum, String branch, double balance,String name,String acType,String bankName) {
        this.acNum = acNum;
        this.branch = branch;
        this.balance = balance;
        this.name = name;
        this.acType = acType;
        this.bankName =bankName;
    }  
    public int getAcNum() {
        return acNum;
    }

    public void setAcNum(int acNum) {
        this.acNum = acNum;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}

/*-------------operation perform in op class-----------------------*/
class op {

    BankData ob;
   public op (BankData ob[])
   {
       this.ob = ob[0];
   }

/*-------------withdraw()l-----------------------*/
    public void withdrawl()
    {
         Scanner sc =new Scanner(System.in);
     
        System.out.println("\n\tEnter amount");
        double amount = sc.nextDouble();
		int min=1000;
		if(ob.getAcType().equals("SavingAccount"))
			min=5000;
		
        if((ob.getBalance()-amount)>=min)
        {
            System.out.println("\twithdrwal success");
            
            ob.setBalance(ob.getBalance()-amount);
            System.out.println("\tbalnce are : "+ob.getBalance());
        }
        else{
            System.out.println("\n\tinfsufficiant balance");
        }    
    }

/*-------------deposit ()-----------------------*/
    public void deposit()
    {
         Scanner sc =new Scanner(System.in);
     
        System.out.println("\n\tEnter amount");
        double amount = sc.nextDouble();
        if(amount>=0)
        {
            System.out.println("\tdposit success");
            
            ob.setBalance(ob.getBalance()+amount);
            System.out.println("\tbalnce are : "+ob.getBalance());
        }
        else{
            System.out.println("\n\tinvalid amount");
        }    
    }
           
}
/*------------- Main Class/client class  -----------------------*/
public class BankClient {

    /*-------------main()-----------------------*/
	public static void main(String args[]) {

        BankData cst[] = new BankData[50];
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int i=0 , acNum;
        String name, branch ;
        String acType="";
        double balance=0;
        String bankName;
        
		/*-----------------Detial-------------------*/
		do{
            System.out.println("\n\tCreat your are Account");

            System.out.println("\n\tSelect Account Type\n");
            System.out.println("\t1 for cuurent Account");
            System.out.println("\t2 for Saving  Account");
            System.out.println("\t3 for Exite");
            System.out.println("\n\tEnter choice");
            ch = sc.nextInt();
			sc.nextLine();
            System.out.println("\tEnter Detail about you\n");
           

		   System.out.println("\tEnter Your name ");
            name = sc.nextLine();
            System.out.println("\tEnter branch name:");
            branch = sc.nextLine();
            System.out.println("\tenter bank name:");
            bankName = sc.nextLine();
			 System.out.println("\tEnter Account number:");
            acNum = sc.nextInt();
            if (ch == 1) {

                acType = "CurrentAccount";
                do{
					System.out.println("\tEnter amount Minimum 1000");
					balance = sc.nextDouble();
					if (balance < 1000)	{
						System.out.println("\tinavalid ammount");				
					}
				}while(balance<1000);
            } 
			else if (ch == 2) {
                acType = "SavingAccount";
                do{
					System.out.println("\tEnter amount Minimum 5000");
					balance = sc.nextDouble();
					if (balance < 5000)	{
						System.out.println("\tinavalid ammount");				
					}
				}while(balance<5000);
					 
			}
          
           if(ch!=3 && ch!=1 && ch!=2){System.out.println("invalid Account Details");}
        }while(ch!=3 && ch!=1 && ch!=2);
        
		//cunstructor calling
		cst[i] = new BankData ( acNum, branch, balance, name,acType,bankName);

		/*----------------- print detials-------------------*/
        System.out.println("\t\t\tCongratulation your account created\n\n");

        System.out.println("\n\tname :  \t\t"+cst[0].getName());
        System.out.println("\n\tBranch : \t\t"+ cst[0].getBalance());
        
        System.out.println("\n\tBank Name\t\t:"+cst[0].getBankName());
        System.out.println("\n\tactype :\t\t"+cst[0].getAcType());
        System.out.println("\n\tBalance :\t\t"+cst[0].getBalance());
        System.out.println("\n\taccount Number :\t\t"+cst[0].getAcNum());
         
        op ob = new op(cst);
		
		//other opretion
		do{
			System.out.println("\n\n\nyou can perform opretions");
			System.out.println("\n\t1 for withdrawl");
			System.out.println("\t2 for deposit");
			System.out.println("\t3 for exit\n");
			System.out.println("\tEnter choice");
			
			ch=sc.nextInt();
		   switch(ch)
			{
				case 1->{
					ob.withdrawl();
					break;
				}
				case 2->{
					ob.deposit();
				break;
				}
			}
	   }while(ch!=3);

    }

}