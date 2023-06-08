/* task 05____28/04/2028
 program to calculate profit or loss.
*/
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Cost prize:  ");
	int cp = sc.nextInt();
	
	System.out.println("Enter a Saling prize:  ");
	int sp = sc.nextInt();
	
	if(cp<0 || sp<0)
	{
		System.out.println("Invalid.. cost or saling prize.");
	}
	else if(cp>sp)
	{
		int loss = cp-sp;
		System.out.println("loss is: "+loss);
	}
	else if(sp>cp)
	{
		int profit = sp-cp;
		System.out.println("profit is: "+profit);
	}
}}