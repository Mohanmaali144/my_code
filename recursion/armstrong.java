//complete --------------armstrong
import java.util.Scanner;
class Test
{
	int sum=0,count=0 ; // Global Variable
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");	
		int n=sc.nextInt();
		Test ob = new Test();
		ob.checkarm(n,ob);
	}
	
	//method check armsterong
	public void checkarm(int n,Test ob)
	{
		int b=digitCount(n);
		 ob.arm(n,b);	
		if(sum==n)
		{
			System.out.println("Armstrongs number ");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}	
	//digitcount
	public int digitCount(int n)
	{	
		if(n==0)
		{
			return count;
		}
		this.digitCount(n/10);
		count++;
		return count;
	}
	
	//power
	public int pow(int n,int b)
	{
		if(b==1)
		{
			return n;
		}
		return  n* pow(n,b-1);
	}
	
	//remender
 	public int arm(int n,int b)
	{	
		if(n!=0)
		{	
			int re = n%10;
			sum=sum+pow(re,b);
			this.arm(n/10,b);
		}
		return sum;
	}
	
}