// count duplicate Element

import java.util.Scanner;
class DuplicateElement
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;				
		int i,j,count=0;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			
		 
			for(i=0;i<size; i++) 
			{	
				for(j=i+1; j<size; j++)
					if(arr[i]==arr[j])
					{
						count++;
						arr[i]=-1;
						arr[j]=-1;
						
					}	
			
			}
			
			System.out.println("sum = "+count);
			
	}
}	