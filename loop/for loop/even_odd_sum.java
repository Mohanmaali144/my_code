import java.util.Scanner;
//// uncomplete
class EvenOddSum
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int i,j;
  
  System.out.print("Even = ");
  for(i=1,j=2; i<=n; i++, j=i*2)
  	System.out.print(j+" ");
  
   System.out.print("Odd = ");
   for(i=1, j=1; i<=n; i++,j=(2*i-1))
    	System.out.print(j+" ");
  }
  }