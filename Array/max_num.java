// maximum number

import java.util.Scanner;
class Max
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;	
		int i,max=-1;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			
		 
			for(i=0;i<size; i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.println("max number is: "+max);
	}
}	