import java.util.Scanner;
class EvenOddSum2
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,evensum=0,oddsum=0;

    System.out.print("Even number:   ");
	while(i<=n)
	{	
      
	 if(i%2==0)
	 {  
	      if(i<n)
		  {
			System.out.print(i+" + ");
		  }
		 evensum +=i;
	 }
	 i++;
	}
	System.out.println(i-1+" = "+evensum);
	
	i=1;
	System.out.print("Odd number:   ");
	while(i<=n)
	{
		 if(i%2!=0)
		{
			if(i<n)
			{
				System.out.print(i+" + ");
			}
			oddsum +=i;
		}
	 i++;
	}
	System.out.print(i+" = "+oddsum);
	
}
}