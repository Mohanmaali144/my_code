// minimum number

import java.util.Scanner;
class Min
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;	
		int i,min=999999999;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			
		 
			for(i=0;i<size; i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println("minimum number is: "+min);
	}
}	