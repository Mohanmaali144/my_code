import java.util.Scanner;
class Main {
	
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter a range");
			int n = sc.nextInt();
					
			for(int i=1; i<=5; i++)
			{			
				for(int j=1;j<=10; j++)
				{
					if(j==(6-i)&& j==(4+i) )
					{
						System.out.print(i);
					}
					else
					{
						System.out.print(" ");
					}
				}
					
				System.out.println();		
			}
		}
	}