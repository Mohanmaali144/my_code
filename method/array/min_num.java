
import java.util.Scanner;
class MinNum
{  
	public void min()
	{	
		Scanner sc = new Scanner(System.in);	
		int a[] = new int[5]; 
		int i;
		System.out.println("Enter Elememnt");
		for(i=0; i<a.length; i++)
			a[i] = sc.nextInt();

		int min=a[0];
		for(i=1; i<a.length; i++)
			if(a[i]<min)
				min=a[i];
		
		System.out.println("Min Element = "+min);
	}	
	public static void main(String[]args)
	{	
		MinNum ob = new MinNum();
		ob.min();		
	}	
}