import java.util.Scanner;
class Profit
{
	private int cp,sp;
	public void setData(int cp,int sp)
	{
		this.cp=cp;
		this.sp=sp;
	}
	public void getData()
	{
		System.out.println("cp = "+this.cp+"\nsp = "+this.sp);
	}
	public void profitLoss()
	{
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
		else
		{
			System.out.println("bothe are Equal");
		}
	}
}

class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Cost prize:  ");
		int cp = sc.nextInt();		
		System.out.println("Enter a Saling prize:  ");
		int sp = sc.nextInt();
		Profit ob =new Profit();
		ob.setData(cp,sp);
		ob.profitLoss();
	}
}