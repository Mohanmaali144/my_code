import java.util.Scanner;

class Factorial
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a num:");
int n = sc.nextInt();
int fact=1;
  for (int i=1; i<=n; i++)
  {
	  fact*=i;
  }  
	  System.out.println(fact);
}
}