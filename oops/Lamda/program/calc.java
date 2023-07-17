import java.util.Scanner;
interface Calculat1 {
	double calculator(double a);
}
interface Calculat2 {
	double calculator(double a,double b);
}
interface Calculat3 {
	double calculator(double a,double b,double c);
}

interface Calculat4 {
     double calculator(double a,double b,double c,double d);
}

 class BL {
		//four digit 
		Calculat4 four1 = (a,b,c,d)-> (a+b+c+d);
		Calculat4 four2 = (a,b,c,d)-> (a-b-c-d);
		Calculat4 four3 = (a,b,c,d)-> (a*b*c*d);
		Calculat4 four4 = (a,b,c,d)-> (a/b/c/d);
		Calculat4 four5 = (a,b,c,d)-> (a%b%c%d);
		//three digit
		Calculat3 three1 = (a,b,c)-> (a+b+c);
		Calculat3 three2 = (a,b,c)-> (a-b-c);
		Calculat3 three3 = (a,b,c)-> (a*b*c);
		Calculat3 three4 = (a,b,c)-> (a/b/c);
		Calculat3 three5 = (a,b,c)-> (a%b%c);
		//two digit
		Calculat2 two1 = (a,b)-> (a+b);
		Calculat2 two2 = (a,b)-> (a-b);
		Calculat2 two3 = (a,b)-> (a*b);
		Calculat2 two4 = (a,b)-> (a/b);
		Calculat2 two5 = (a,b)-> (a%b);
		//one digit
		Calculat1 one1 = (a)-> (a*a);
		Calculat1 one2 = (a)-> (a*a*a);		
	} 
class MainCalc {
	
	public static void main(String []args)
	{
		BL ref = new BL();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		// choice and calling...
		do{
			System.out.println("\n\tchoice are ... ");
			System.out.println("\t__________________________\n");
			System.out.println("\t1 for one digit");
			System.out.println("\t2 for two digit");
			System.out.println("\t3 for three digit ");
			System.out.println("\t4 for four digit");
			System.out.println("\t5 for Exit ");
			System.out.println("Enter coice");
			choice = sc.nextInt();
			switch(choice)
			{						
				case 1:
					do{
						System.out.println("\n\tchoice are ... ");
						System.out.println("\t__________________________\n");
						System.out.println("\t1 for square");
						System.out.println("\t2 for Qube");
						System.out.println("\t3for Back");					
						System.out.println("Enter coice");
						choice = sc.nextInt();
						double a;
						switch(choice)
						{
							case 1:
								System.out.println("Enter a number");
								a = sc.nextDouble();
								System.out.println("Result = "+ref.one1.calculator(a));
							break;
							
							case 2:
								System.out.println("Enter a number");
								a = sc.nextDouble();
								System.out.println("Result = "+ref.one2.calculator(a));				
						}
					}while(choice!=3);
				break;
				case 2:
						
					do{	
						System.out.println("\n\tchoice are ... ");
						System.out.println("\t__________________________\n");
						System.out.println("\t1 for Addition");
						System.out.println("\t2 for Substraction");
						System.out.println("\t3 for Multiplication");
						System.out.println("\t4 for Division");
						System.out.println("\t5 for Modulas");
						System.out.println("\t6 for Back");
						System.out.println("Enter coice");
						choice = sc.nextInt();
						double a,b;
						switch(choice)
							{
								case 1:
									System.out.println("Enter two number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									System.out.println("Result = "+ref.two1.calculator(a,b));
								break;
								
								case 2:
									System.out.println("Enter two number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									System.out.println("Result = "+ref.two2.calculator(a,b));	
								break;
								case 3:
									System.out.println("Enter two number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									System.out.println("Result = "+ref.two3.calculator(a,b));	
								break;
								case 4:
									System.out.println("Enter two number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									System.out.println("Result = "+ref.two4.calculator(a,b));	
								break;
								case 5:
									System.out.println("Enter two number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									System.out.println("Result = "+ref.two5.calculator(a,b));	
								break;
								
							
							}
					}while(choice!=6);
				 break;
				case 3:
					do{	
						System.out.println("\n\tchoice are ... ");
						System.out.println("\t__________________________\n");
						System.out.println("\t1 for Addition");
						System.out.println("\t2 for Substraction");
						System.out.println("\t3 for Multiplication");
						System.out.println("\t4 for Division");
						System.out.println("\t5 for Modulas");
						System.out.println("\t6 for Back");					
						System.out.println("Enter coice");
						choice = sc.nextInt();
						double a,b,c;
						switch(choice)
							{
								case 1:
									System.out.println("Enter three number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									System.out.println("Result = "+ref.three1.calculator(a,b,c));
								break;
								
								case 2:
									System.out.println("Enter three number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									System.out.println("Result = "+ref.three2.calculator(a,b,c));	
								break;
								case 3:
									System.out.println("Enter three number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									System.out.println("Result = "+ref.three3.calculator(a,b,c));	
								break;
								case 4:
									System.out.println("Enter three number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									System.out.println("Result = "+ref.three4.calculator(a,b,c));	
								break;
								case 5:
									System.out.println("Enter three number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									System.out.println("Result = "+ref.three5.calculator(a,b,c));	
								break;
								
							}
					}while(choice !=6);
				
				break;
				case 4:
						do{	
						System.out.println("\n\tchoice are ... ");
						System.out.println("\t__________________________\n");
						System.out.println("\t1 for Addition");
						System.out.println("\t2 for Substraction");
						System.out.println("\t3 for Multiplication");
						System.out.println("\t4 for Division");
						System.out.println("\t5 for Modulas");
						System.out.println("\t6 for Back");	
						System.out.println("Enter coice");
						choice = sc.nextInt();
						double a,b,c,d;
						switch(choice)
							{
								case 1:
									System.out.println("Enter four number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									d = sc.nextDouble();
									System.out.println("Result = "+ref.four1.calculator(a,b,c,d));
								break;
								
								case 2:
									System.out.println("Enter four number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									d = sc.nextDouble();
									System.out.println("Result = "+ref.four2.calculator(a,b,c,d));	
								break;
								case 3:
									System.out.println("Enter four number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									d = sc.nextDouble();
									System.out.println("Result = "+ref.four3.calculator(a,b,c,d));	
								break;
								case 4:
									System.out.println("Enter four number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									d = sc.nextDouble();
									System.out.println("Result = "+ref.four4.calculator(a,b,c,d));	
								break;
								case 5:
									System.out.println("Enter four number");
									a = sc.nextDouble();
									b = sc.nextDouble();
									c = sc.nextDouble();
									d = sc.nextDouble();
									System.out.println("Result = "+ref.four5.calculator(a,b,c,d));	
								break;
								
							}
					}while(choice !=6);
				break;	
			}
		}while(choice!=5);			
	}
}
