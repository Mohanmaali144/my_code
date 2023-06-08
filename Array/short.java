// Asending order 

import java.util.Scanner;
class Short1
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
			for(i=0;i<size; i++)
			{ 
				for(j=i+1; j<size; j++)
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				
			}
			System.out.print("__________________________________________\n\n Asending : ");
			for(i=0;i<size;i++)
			{ 
				System.out.print(arr[i]+" ");
			}
	}
}	



// Disending order

class Short2
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
			for(i=0;i<size; i++)
			{ 
				for(j=i+1; j<size; j++)
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				
			}
			System.out.print("__________________________________________\n\n Disending : ");
			for(i=0;i<size;i++)
			{ 
				System.out.print(arr[i]+" ");
			}
	}
}	