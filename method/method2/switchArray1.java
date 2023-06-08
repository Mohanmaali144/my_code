import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		System.out.println("Enter eliment in array: ");	
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		Array ob = new Array();
		int ch;
		do{
			System.out.println("\nchoce are...");	
			System.out.println("press 1 for sum ");
			System.out.println("press 2 for 2 Elemnet sum ");
			System.out.println("press 3 for print Element ");
			System.out.println("press 4 for print Element under 250 ");
			System.out.println("press 5 for Exit");
			System.out.println("Enter choice.. ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					ob.sum(a,n);
				break;
				
				case 2:
					ob.elementSum(a,n,sc);
				case 3:
					ob.printEle(a,n);	
				break;

				case 4:
					ob.under250(a,n);	
				break;
			}
		}while(ch!=5);	
	}
	public void sum(int a[],int n)
	{	
		int sum =0;
		for(int i=0; i<n; i++)
			sum+=a[i];	
		System.out.println("sum = "+sum);
	}
	public void elementSum(int a[],int n,Scanner sc)
	{	
		int sum=0;
		int n1;
		int n2;
		System.out.println("Enetr Element to sum");
		do{
		 n1=sc.nextInt();
		 n2=sc.nextInt();	
		if(n1<0 || n1>(n-1) || n2<0 || n2>(n-1))
			System.out.println("Wrong index...!! \nEnter Again..");
		}while(n1<0 || n1>(n-1) || n2<0||n2>(n-1));
		
			sum = a[n1] + a[n2];	
		System.out.println("sum = "+sum);
	}
		
	public void printEle(int a[], int n)
	{
		int i;
		boolean flag=true;
		for( i=0; i<n; i++)		
		{	if(a[i]>=150 && a[i]<=250)
			{	
				System.out.print(a[i]+" ");
				flag= false;
			}
		}
		if(flag)
				System.out.print("element are not greater 150 || les than 250");	
	}
	
	public void under250(int a[], int n)
	{
		int i;
		boolean flag=true;
		for( i=0; i<n; i++)		
		{	if(a[i]<250)
			{	
				System.out.print(a[i]+" ");
				flag= false;
			}
		}
		if(flag)
				System.out.print("element are not les than 250");	
	}
	
}
				