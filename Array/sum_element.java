// Sum Element

import java.util.Scanner;
class SumElement
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;				
		int i,sum=0;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			
		 
			for(i=0;i<size; i++) 
				sum+=arr[i];
			
				System.out.println("sum = "+sum);
			
	}
}	