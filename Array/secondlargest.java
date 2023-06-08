import java.util.Scanner;
class SecondLargest
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[10];
		int i=0,max;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<10; i++)
			a[i]= sc.nextInt();	
		max=a[0];
		
		for(i=0; i<10; i++)
		{
			if(a[i]>max)
				max=a[i];
		}	
		//System.out.println("maximum Element is: "+max);	
		int slarg =max;
		for(i=0; i<10; i++)
		{
			if(a[i]<slarg)
				slarg=a[i];
		}		
		int index=0;
		for(i=1; i<10; i++)
		{
			if(a[i]>slarg && a[i]<max)
			{ slarg = a[i];
			  index =i;
			}
		}		
		System.out.println("Second largest Element is: a["+index+"]= "+slarg);
	}
}	
		