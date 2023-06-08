import java.util.Scanner;

class DigitSum
{
public static void main(String[]arg)
 {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a num");  
	  int n = sc.nextInt();
	  int sum=0;
  
  for(; n>0; )
  {
	  int re = n%10;
	  sum+=re;
	  n/=10;
  }
  
  System.out.println("Digit sum = "+ sum);  
 }
}