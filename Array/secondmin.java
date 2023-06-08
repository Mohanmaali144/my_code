import java.util.Scanner;
class SecondMin
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[5];
		int i=0,min;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<5; i++)
			a[i]= sc.nextInt();	
		min=a[0];
		
		for(i=0; i<5; i++)
		{
			if(a[i]<min)
				min=a[i];
		}	
		System.out.println("minimum Element is: "+min);
	
		int smin = 99999;
		int index=0;
		for(i=0; i<5; i++)
		{
			if(a[i]>min && a[i]<smin)
			{ 
			  smin = a[i];
			  index =i;
			}
		}		
		System.out.println("Second Minimum Element is: a["+index+"]= "+smin);
	}
}	
		