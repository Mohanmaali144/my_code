/*calculator using Switch case and method________10/06/2023*/
import java.util.Scanner;
class Test2
{		
  public static void main(String []arg)
  {
	  Test2 ob = new Test2();
	  ob.takeEle();
  }
	
	public void takeEle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want enter");
		int ele = sc.nextInt();			
		int a,b,c,d,ch;
		switch(ele)
		{			
			case 2:
				System.out.println("\tchoice are:\n\tpress 1  for Addition\n\tpress 2  for substract\n\tpress 3  for multiplcation \n\tpress 4  for Division");	
				System.out.println("\tEnter your choice:");
				ch = sc.nextInt();	
				System.out.println("Enter two number");
				a=sc.nextInt();
				b=sc.nextInt();
				this.element2(a,b,ch);			
			break;
			
			case 3:
				System.out.println("\tchoice are:\n\tpress 1  for Addition\n\tpress 2  for substract\n\tpress 3  for multiplcation \n\tpress 4  for Division");	
				System.out.println("\tEnter your choice:");
				ch = sc.nextInt();
				 System.out.println("Enter three number");					 
				 a=sc.nextInt();
				 b=sc.nextInt();
				 c=sc.nextInt();
			this.element3(a,b,c,ch);
			break;
			
			case 4:
				System.out.println("\tchoice are:\n\tpress 1  for Addition\n\tpress 2  for substract\n\tpress 3  for multiplcation \n\tpress 4  for Division");	
				System.out.println("\tEnter your choice:");
				 ch = sc.nextInt();	
				 System.out.println("Enter four number");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 c=sc.nextInt();
				 d=sc.nextInt();
				this.element4(a,b,c,d,ch);
			break;
			
			default:
				System.out.println("Invalid choice....");		
		}
	}
		public void element2(int a,int b,int ch)
		{	
			switch(ch)
			{
				case 1:
					System.out.print("sum = "+this.add(a,b));			
				break;

				case 2:
					System.out.print("substract = "+this.sub(a,b));	
				break;
				
				case 3:
					System.out.print(" multiplication ="+this.multi(a,b));
					
				case 4:
					System.out.print("Division = "+this.div(a,b));
				break;
				
				default :
					System.out.print("Invalid choice");
			}
		}
			
		public void element3(int a, int b,int c,int ch)
		{
				
			switch(ch)
			{
				case 1:
					System.out.print("Sum"+this.add(a,b,c));			
				break;

				case 2:
					System.out.print("Substraction"+this.sub(a,b,c));	
				break;
				
				case 3:
					System.out.print("multiplication"+this.multi(a,b,c));
					
				case 4:
					System.out.print("Division"+this.div(a,b,c));
				break;
				
				default :
					System.out.print("Invalid choice");
			}
		}
		
		public void element4(int a, int b,int c,int d,int ch)
		{
			switch(ch)
			{
				case 1:
					System.out.print("sum = "+this.add(a,b,c,d));			
				break;

				case 2:
					System.out.print("Substarction"+this.sub(a,b,c,d));	
				break;
				
				case 3:
					System.out.print("multiplication"+this.multi(a,b,c,d));
					
				case 4:
					System.out.print("division"+this.div(a,b,c,d));
				break;
				
				default :
					System.out.print("Invalid choice");
			}
		}
	
	 //---------------sum---------------------
	
	 public int add(int a,int b)
	  {
		  return a+b;
	  }
	  public int add(int a,int b,int c)
	  {
		  return this.add(a,b)+c;
	  }
	  public int add(int a,int b,int c,int d)
	  {
		  return this.add(a,b,c)+d;
	  }
	   
	   //-------------subtraction---------------------
	  public int sub(int a,int b)
	  {
		  return a-b;
	  }
	  public int sub(int a,int b,int c)
	  {
		  return this.sub(a,b)-c;
	  }
	  public int sub(int a,int b,int c,int d)
	  {
		  return this.sub(a,b,c)-d;
	  }
	  
	  //-------------multiplcation---------------------
	  public int multi(int a,int b)
	  {
		  return a*b;
	  }
	  public int multi(int a,int b,int c)
	  {
		  return this.multi(a,b)*c;
	  }
	  public int multi(int a,int b,int c,int d)
	  {
		  return this.multi(a,b,c)*d;
	  }
	  
	  //---------------division----------------------
	 
	 public int div(int a,int b)
	  {
		  return a/b;
	  }
	  public int div(int a,int b,int c)
	  {
		  return this.div(a,b)/c;
	  }
	  public int div(int a,int b,int c,int d)
	  {
		  return this.div(a,b,c)/d;
	  }
}
