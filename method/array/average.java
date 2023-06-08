import java.util.Scanner;
class Avg
{  
	public double avg(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter length of array");
		int i, size = sc.nextInt();		
		double sum=0;	
		System.out.println("Enter Elememnt");
		for(i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
			sum+=b[i];
		}	
		return sum/size;		
	}	
	public static void main(String[]args)
	{	
		int a[]=new int [10];
		Avg ob = new Avg();
		System.out.println("Average = "+ob.avg(a));		
	}	
}