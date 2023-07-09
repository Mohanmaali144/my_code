import java.util.Scanner;
class Sum
{
	private int arr[],size;
	public void setData(int arr[],int n)
	{
		this.arr=arr;
		this.size=n;
	}
	public int[] getData()
	{
		return arr;
	}	
	public int sumArray()
	
	{
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum=sum+this.arr[i];
		}
		return sum;
	}
}
class Test
{
	public void input(Sum ob)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		ob.setData(arr,n);
	}
	public static void main(String args[])
	{
		Sum ob=new Sum();
		Test ob2 = new Test();
		ob2.input(ob);
		int res=ob.sumArray();
		System.out.println("\nSum of array="+res);
	}
}
