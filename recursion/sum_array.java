// complete
import java.util.Scanner;
class Sum
{
	int sum=0;
	public static void main(String[]args)
	{
		Sum ob = new Sum();
		ob.getEle();	
	}
	public void getEle()
	{	
		int a[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenth of Array");
		int n= sc.nextInt();
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(sumEle(a,n-1));
	}
	public int sumEle(int a[],int n) // sum Array
	{
		if(n<0)
		{
			return sum;
		}
		sum+=a[n];
		return this.sumEle(a,n-1);
	}
	
}
	