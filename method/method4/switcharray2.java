//uncomplete
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [10];
		System.out.println("Enter size number");
		int n = sc.nextInt();
		System.out.println("\t1.Minimum Number");
		System.out.println("\tMaximum Number=");
		System.out.println("\tSecond Minimum");
		System.out.println("\tSecond Maximum");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		Test ob = new Test();
		a = ob.getEle(a,n,sc);   // mistek:- int k  change: [a = ob.getEle(a);]
		switch(ch)
		{
			case 1:ob.findmin(a,n);
			break;
			
			case 2:ob.findmax(a,n);
			break;
			
			case 3:ob.smin(a,n);
			break;
			
			case 4:ob.smax(a,n);
			break;
		}
	}
	
	
	public int[] getEle(int a[],int n,Scanner sc ) 
	{
		
		System.out.println("Enter array Element");
		for(int i=0 ; i<n ; i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}
	public void findmin(int a[],int n)
	{
		int min = a[0];
		for(int i=0 ; i<n; i++)
		{	
			if(a[i]<min)
			{
				min = a[i];
			}
		} 
        System.out.println("Minimum Number =" + min);		
	}
	public void findmax(int a[],int n)
	{
		int max = 0;
		for(int i=0 ; i<n ; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum Number="+max);
	}
	
	public void smin(int a[],int n)
	{
		int i;
		int min = 0,min2=0;
		for(i=0; i<n; i++)
		{
			if(a[i]<min2)
			{
				min = min2;
				min2 = a[i];
			}
			else if(a[i]<min2 && a[i]>min)
			{
				min2 = a[i];
			}
		}	
			System.out.println("First Manimum="+min);
			System.out.println("second Minimum="+min2);
		
	}
	
	public void smax(int a[],int n)
	{
		int i;
		int max = 0,max2=0;
		for(i=0; i<n; i++)
		{
			if(a[i]>max2)
			{
				max = max2;
				max2 = a[i];
			}
			else if(a[i]>max2 && a[i]<max)
			{
				max2 = a[i];
			}
		}	
			System.out.println("First Maximum="+max);
			System.out.println("second Maximum="+max2);
		
	}	
}