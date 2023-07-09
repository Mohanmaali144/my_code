import java.util.Scanner;
class Fibonaci
{
	public static void main(String[]arg)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a num");  
	  int n = sc.nextInt();
	  int i,a=0,b=1,c=0 ;
	  
	  for(i=1; i<=n; i++, a=b,b=c,c=a+b)
		System.out.print(c+" "); 
	}
}