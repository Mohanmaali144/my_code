
import java.util.Scanner;

class ProfitLoss
{
	
	public void profitloss()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost amount: ");
		int cost = sc.nextInt();	
		System.out.println("Enter seling amount");
		int sell = sc.nextInt();
		if(cost>sell)
		{
			int loss = cost - sell;
			System.out.println("loss are  "+loss+"/-");
		}
		else if(sell>cost)
		{
			int profit=  sell-cost;
			System.out.println("profit are  "+profit+"/-");
		}
		else if(sell == cost)
			System.out.println("No profit loss");
			
	}
	
	public static void main(String[]args)
	{
		ProfitLoss ob = new ProfitLoss();	
		ob.profitloss();

	}	
}