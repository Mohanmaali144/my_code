import java.util.Scanner;
class Copy
{  
	public int find(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter length of array");
		int i, size = sc.nextInt();		
		System.out.println("Enter Elememnt");
		for(i=0; i<size; i++)
			b[i]=sc.nextInt();		
		
		int f[] = new int [size];
		for(i=0; i<size; i++)
			f[i]=b[i];
		
		for(i=0; i<size; i++)
			System.out.print(f[i]);
			
		return 0;		
	}	
	public static void main(String[]args)
	{	
		int a[]=new int [10];
		Copy ob = new Copy();
		ob.find(a);		
	}	
}