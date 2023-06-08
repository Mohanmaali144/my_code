import java.util.Scanner;
class EvenOddSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,evensum=0,oddsum=0;

    
	while(i<=n)
	{	
      
	 if(i%2==0)
	 {
		 evensum +=i;
	 }
	 else
	 {
		 oddsum +=i;
	 }
	 i++;
	}
	System.out.println("Even sum = "+evensum);
	
	System.out.print("Odd sum = "+oddsum);
	
}
}