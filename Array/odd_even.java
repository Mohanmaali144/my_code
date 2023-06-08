// odd even element  Array

import java.util.Scanner;
class OddEven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;					
		int i,j;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			
			System.out.print("Even Element are: ");
			for(i=0;i<size; i++)
			{ 
				if(arr[i]%2==0)
					System.out.print(arr[i]+" ");
			}
			System.out.print("\nOdd Element are: ");
			for(i=0;i<size;i++)
			{ 
				if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
			}
	}
}	