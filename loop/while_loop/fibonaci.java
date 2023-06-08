import java.util.Scanner;
/*fibonaciseries_____08/05/2023*/
class Fibonaci
{
	public static void main(String[]arg)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a term: ");
	int n = sc.nextInt();
	
	int fibo=0,i=1,a=0,b=1;
	
	while(i<=n)
	{
		
		System.out.print(fibo+" ");
		
		a=b;
		b=fibo;
		fibo = a+b;
		i++;
	}
	

}}