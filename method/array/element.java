import java.util.Scanner;
class Element
{  
	public int[]sum(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter length of array");
		int size = sc.nextInt();
		int i,sum=0;	
		System.out.println("Enter Elememnt");
		for(i=0; i<size; i++)
			b[i] = sc.nextInt();
		
		for(i=0; i<size; i++)
			sum+=b[i];
		System.out.println("Element sum ="+sum);
		this.sqr(b,size);
		return b;		
	}
	
	public int[] sqr(int b[],int size)
	{	
		for(int i=0; i<size; i++)
			System.out.print(b[i]*b[i]+" ");
		return b ;		
	}
	public static void main(String[]args)
	{	
		int a[]=new int [10];
		Element ob = new Element();
		a=ob.sum(a);		
	}	
}