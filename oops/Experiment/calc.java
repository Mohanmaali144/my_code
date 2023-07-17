import java.util.Scanner;

 interface Calculator {
	
	 public abstract double Calculat(double ...arr);
}  

class Op{	
			Calculator ref1 = new Calculator(){
			@Override
			public double Calculat(double ...arr)
			{
				double result=0;
				for(double z : arr)
				{
					result+=z;
				}
				return result;
			} 
		};
		Calculator ref2 = new Calculator(){
			
			@Override
			public double Calculat(double ...arr)
			{
				double result=0;
				for(double z : arr)
				{
					result-=z;
				}
				return result;
			}
		};
		Calculator ref3 = new Calculator(){
			@Override
			public double Calculat(double ...arr)
			{
				double result=0;
				for(double z : arr)
				{
					result*=z;
				}
				return result;
			}
		};
		Calculator ref4 = new Calculator(){
			
			@Override
			public double Calculat(double ...arr)
			{
				double result=0;
				for(double z : arr)
				{
					result/=z;
				}
				return result;
			}
		};	
		Calculator ref5 = new Calculator(){
			
			@Override
			public double Calculat(double ...arr)
			{
				double result=0;
				for(double z : arr)
				{
					result%=z;
				}
				return result;
			}
		};	
}
class Main {
	
	public void choice()
	{
		int choice,a,b;
		Op ob = new Op();
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("\n\tChoice are..");
		System.out.println("\t_____________________\n");
		System.out.println("\t1 for Addition");
		System.out.println("\t2 for Subsraction");
		System.out.println("\t3 for Multiplication");
		System.out.println("\t4 for Division");
		System.out.println("\t5 for Modulas");
		System.out.println("\t6 for Exit");
		System.out.println("\t_____________________\n");
		System.out.println("");
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("------------------------");
		switch(choice)
		{
			case 1:
				System.out.println("Addtion = "+ob.ref1.Calculat(a,b,2,3));
			break;
			case 2:
				System.out.println("Subsraction = "+ob.ref2.Calculat(a,b));
			break;
			case 3:
				System.out.println("Multiplication = "+ob.ref3.Calculat(a,b));
			break;
			case 4:
				System.out.println("Division = "+ob.ref4.Calculat(a,b));
			break;
			case 5:
				System.out.println("Modulas = "+ob.ref5.Calculat(a,b));
			break;				
		}
		System.out.println("------------------------\n");
	}while(choice != 6);
	}	
	public static void main(String []args)
	{
		Main obj = new Main();
		obj.choice();
	}
}
 