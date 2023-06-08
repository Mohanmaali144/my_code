import java.util.Scanner;

class Prime2
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int i,flag=1;
  for(i=2; i<n; i++)
  {
	  if(n%i==0)
	  {
		   flag=0;
		   break;
	  }
  }
  if(flag==0)
	  System.out.println("Not prime number");
  
  else
	  System.out.println("prime number");
}
}