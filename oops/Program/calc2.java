import java.util.Scanner;
class Calculator
{
	private  double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double add()
	{
		return this.a+this.b;
	}
	public double sub()
	{
		return this.a-this.b;
	}
	public double multi()
	{
		return this.a*this.b;
	}
	public double division()
	{
		return this.a/this.b;
	}
	public double modulas()
	{
		return this.a%this.b;
	}
}
class Test
{
	public static void main(String[]args)
	{	
		Scanner sc = new Scanner(System.in);
		int ch;
		Calculator ob = new Calculator();
		do{
			System.out.println("your choices are...");
			System.out.println("\n\t1 for Addition\n\t2 for Substraction");
			System.out.println("\t3 for Multiplication\n\t4 for Division");
			System.out.println("\t5 for Modulas\n\t6 for Exit");
			System.out.println("Enter you choice");
			 ch = sc.nextInt();
			double x ;
			double y ;
			double res;
			switch(ch)
			{
				case 1:
					System.out.println("Enter two number");
					 x =sc.nextDouble();
					 y =sc.nextDouble();
					ob.setData(x,y);
					res = ob.add();
					System.out.println("Addition = "+res);
				break;
				case 2:
					System.out.println("Enter two number");
					 x =sc.nextDouble();
					 y =sc.nextDouble();
					ob.setData(x,y);
					res=ob.sub();
					System.out.println("Substraction = "+res);
				break;
				case 3:
					System.out.println("Enter two number");
					 x =sc.nextDouble();
					 y =sc.nextDouble();
					ob.setData(x,y);
					 res = ob.multi();
					System.out.println("Multiplication = "+res);
				break;
				case 4:
					System.out.println("Enter two number");
					 x =sc.nextDouble();
					y =sc.nextDouble();
					ob.setData(x,y);
					res=ob.division();
					System.out.println("Division = "+res);
				break;
				case 5:
					System.out.println("Enter two number");
					x =sc.nextDouble();
					y =sc.nextDouble();
					ob.setData(x,y);
					res=ob.modulas();
					System.out.println("Modulas = "+res);
				break;
			}
		}while(ch!=6);			
	}	
}