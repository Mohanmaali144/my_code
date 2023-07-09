// revers Array
import java.util.Scanner;
class Revers
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		int arr[] = new int [size] ;
		int brr[] = new int [size] ;					
		int i,j;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			arr[i]= sc.nextInt();
		}			 
		for(i=size-1,j=0;i>=0; i--,j++)
		{ 
			brr[j]=arr[i];
		}
		for(i=0;i<size;i++)
		{ 
			System.out.println(brr[i]+" ");
		}
	}
}	