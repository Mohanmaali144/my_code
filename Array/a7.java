// input


import java.util.Scanner;
class A7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
			
		int i;
		System.out.println("how many eliment want you enter: ");
		int n=sc.nextInt();
		for(i=0; i<n; i++)
			a[i]=sc.nextInt();
	
		
		for(i=0; i<n; i++)	
			System.out.print(a[i]+" ");
			
		
		
	}
}	