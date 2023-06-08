import java.util.Scanner;

class Prime
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int i;
  for(i=2; i<n; i++)
  {
	  if(n%i==0)
	  break;
  }
  if(i==n)
	  System.out.println("prime number");
  
  else
	  System.out.println("Not prime number");
}
}