// print Unique Element

import java.util.Scanner;
class Unique
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
			{	int count=0;
				for(j=i+1; j<size; j++)
					if(arr[i]==arr[j] ||arr[i]==-1)
					{
						count++;
						arr[i]=-1;
					}	
			
				if(count==0)
				System.out.print(+arr[i]+" ");
			}
			
			//System.out.println("sum = "+count);
			
	}
}	