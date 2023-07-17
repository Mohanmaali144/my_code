import java.util.Scanner;

/* interface Calculator {
	
	 public abstract double Calculat(double a,double b);
}  */

class Operation{
	
	public static void main(String []args)
	{
			Calculator ref1 = new Calculator(){
			@Override
			public double Calculat(double a,double b)
			{
				return a+b;
			} 
		};
		Calculator ref2 = new Calculator(){
			
			@Override
			public double Calculat(double a,double b)
			{
				return a-b;
			}
		};
		Calculator ref3 = new Calculator(){
			@Override
			public double Calculat(double a,double b)
			{
				return a*b;
			}
		};
		Calculator ref4 = new Calculator(){
			
			@Override
			public double Calculat(double a,double b)
			{
				return a/b;
			}
		};

		System.out.println("Addtion = "+ref1.Calculat(2,4));
		System.out.println("Subsraction = "+ref2.Calculat(5,2));
		System.out.println("Multiplication = "+ref3.Calculat(3,5));
		System.out.println("Division = "+ref4.Calculat(20,3));
	}	
}
 