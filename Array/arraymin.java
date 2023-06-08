import java.util.Scanner;
class MinArray
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[10];
		int i=0,min;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<10; i++)
			a[i]= sc.nextInt();
		
		min=a[0];
		
		for(i=0; i<10; i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		
		System.out.println("minimum Element is: "+min);
	}
}	
		