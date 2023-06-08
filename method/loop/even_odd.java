
import java.util.Scanner;

class EvenOdd
{ 
		public void evenseries()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter range ");
			int n = sc.nextInt();
			int i =1;
			while(i<=n)
			{
				if(i%2==0)
					System.out.print(i+" ");
				i++;
			}			
		}
	
	
		public void oddseries()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range ");
				int n = sc.nextInt();
				int i =1;
				while(i<=n)
				{
					if(i%2!=0)
						System.out.print(i+" ");
					i++;
				}			
			}
			
	 	public void evensum()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range ");
				int n = sc.nextInt();
				int i =1,sum=0;
				while(i<=n)
				{
					if(i%2==0)
						sum+=i;
					i++;
				}	
				System.out.println("Even sum = "+sum);				
			}

		public void oddsum()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range ");
				int n = sc.nextInt();
				int i =1,sum=0;
				while(i<=n)
				{
					if(i%2!=0)
						sum+=i;
					i++;
				}	
				System.out.println("odd sum = "+sum);				
			}
		
		public void evensqr()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range ");
				int n = sc.nextInt();
				int i =1,sum=0;
				while(i<=n)
				{
					if(i%2==0)
				    System.out.println((i*i)+" ");	
					i++;
				}	
							
			}
			
			public void oddsqr()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range ");
				int n = sc.nextInt();
				int i =1,sum=0;
				while(i<=n)
				{
					if(i%2!=0)
				    System.out.println((i*i)+" ");	
					i++;
				}	
							
			}
		
		
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choice Are..");
		System.out.println("press 1 for Even Series");
		System.out.println("press 2 for Odd Series");
		System.out.println("press 3 for Even Sum");
		System.out.println("press 4 for Odd Sum");
		System.out.println("press 5 for even Square");
		System.out.println("press 6 for Odd Square");
		System.out.println("Enter choice..");
		int ch = sc.nextInt();
		EvenOdd ob = new EvenOdd();
		switch(ch)
		{
			case 1: 
				ob.evenseries();
			break;
			
			case 2: 
				ob.oddseries();
			break;
			
			case 3: 
				ob.evensum();
			break;
			
			case 4: 
				ob.oddsum();
			break;
			
			case 5: 
				ob.evensqr();
			break;
			
			case 6:
				ob.oddsqr();
			break;
			
			default:
				System.out.println("invalid choice");
		}
	}	
}