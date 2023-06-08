import java.util.Scanner;
class SumArray
{
	public static void main(String[]args)
	{	
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a[] = new int[10];	
		System.out.println("Enter eliment in array: ");	
		for(int i=0; i<10; i++)
			a[i]= sc.nextInt();	
		
		for(int i=0; i<10; i++)
			sum+=a[i];	
		System.out.println("sum = "+sum);
	}
}	
		