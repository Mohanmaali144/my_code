// input


import java.util.Scanner;
class A8
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		System.out.println("how many eliment want you enter: ");
		int n=sc.nextInt();
		int a[]= new int[n];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<n; i++)
			a[i]=sc.nextInt();
	
		
		for(i=0; i<n; i++)	
			System.out.print(a[i]+" ");
			
		
		
	}
}	