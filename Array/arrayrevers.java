import java.util.Scanner;
class ReversArray
{
	public static void main(String[]args)
	{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("how many Element want you enter in array: ");
		int n = sc.nextInt();
		int a[]=new int[n];
		int i=0;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<n; i++)
			a[i]= sc.nextInt();
		
		for(i=0; i<n; i++)
		System.out.println("a["+ i + "]" + a[i]);
		
		for(i=0; i<n/2; i++)
		{
			int temp= a[i];
			a[i]= a[n-i-1];	
			a[n-i-1]=temp;		 	
		}	
		
		System.out.println("_________________________________________________");
		
		for(i=0; i<n; i++)
			System.out.println("a["+i+"]"+a[i]);				
	}
}	
		