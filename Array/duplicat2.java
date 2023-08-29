//delete element given by user

import java.util.Scanner;

class Duplicate {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int a[] = new int[5];
		int n=5;
		System.out.println("Enter element");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element want you delete");
		int d =sc.nextInt();
		
		int b[] = new int[n];
		
		int k=0;			
		for(int i=0; i<5; i++)
		{
			if(a[i]!=d)
			{
				b[k]=a[i];
				k++;
			}
			if(a[i]==d)
			{
				n--;
			}		
		}
		
		System.out.println("---------------------------------------------------");
		for(int i=0; i<n; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}