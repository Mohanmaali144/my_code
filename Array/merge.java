// merge Array

import java.util.Scanner;
class Merge
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] ={3,2,3};	//new int [size] ;	
		int brr[] ={3,5,1};
		int crr[] = new int [6];
		int i,j;
		/*for(i=0; i<size; i++)
		{	 		
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}*/
		
		for(i=0;i<3;i++)
			crr[i]=arr[i];
		for(j=0;j<3;j++)
		{
			crr[i]= brr[j];
			i++;
		}
			
		for(i=0;i<6; i++)
			{ 
				for(j=i+1; j<6; j++)
					if(crr[i]>crr[j])
					{
						int temp=crr[i];
						crr[i] = crr[j];
						crr[j] = temp;
					}
				
			}
			System.out.print("__________________________________________\n\n Asending : ");
			for(i=0;i<6;i++)
			{ 
				System.out.print(crr[i]+" ");
			}
			
	}
}	
		 