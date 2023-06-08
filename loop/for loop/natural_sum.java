import java.util.Scanner;

class NaturalSum
{
public static void main(String[]arg)
 {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a num");  
	  int n = sc.nextInt();
	  int i,sum=0;
	  
	  for(i=1; i<=n; sum=sum+i ,i++)
	  {
		  System.out.print(i); 
		if(i<n)
			System.out.print(" + "); 
	  }
	  
	  System.out.println" = "+sum); 
 }
}
	  