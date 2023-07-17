import java.util.Scanner;
interface In1 {
	int add();
	int sub();
	int multi();
	int divide();
}
class Op implements In1 {
	int a,b;
	public Op()
	{
		this.a=0;
		this.b=0;
	}
	public Op(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public int add()
	{
		return this.a+this.b;
	}
	public int sub()
	{
		return this.a-this.b;
	}
	public int multi()
	{
		return this.a*this.b;
	}
	public int divide()
	{
		return this.a/this.b;
	}
}

class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Op ob = new Op(20,2);
		int choice,a,b;
		do{
			System.out.println("\nchoice are...");
			System.out.println("1 for Addition");
			System.out.println("2 for Subsraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("5 for Exit");
			System.out.println("");
			System.out.println("Enter choice.....");
			choice = sc.nextInt();
			System.out.println("Enter two number: ");
			a = sc.nextInt();
			b = sc.nextInt();
			Op ob = new Op(a,b);
			switch(choice)
			{
				case 1:
					System.out.println("Addition = "+ob.add());
				break;
				case 2:
					System.out.println("Substraction = "+ob.sub());
				break;
				case 3:
					System.out.println("Multiplication = "+ob.multi());
				break;
				case 4:
					System.out.println("Division = "+ob.divide());
				break;		
			}
		}while(choice!=5);
	}
}
