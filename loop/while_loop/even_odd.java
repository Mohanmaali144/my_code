import java.util.Scanner;
class EvenOdd
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;

    System.out.print("Even num is: ");
	while(i<=n)
	{	
      
	 if(i%2==0)
	 {
		 System.out.print(i+" ");
	 }
	 
	 i++;
	}
	
	
	i=1;
	System.out.print("\nOdd num is: ");
	while(i<=n)
	{	
      
	 if(i%2!=0)
	 {
		 System.out.print(i+" ");
	 }	 
	 i++;
	}
}
}