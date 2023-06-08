
import java.util.Scanner;
class LargeNum
{  
	public void large()
	{	
		Scanner sc = new Scanner(System.in);	
		int a[] = new int[5]; 
		int i;
		System.out.println("Enter Elememnt");
		for(i=0; i<a.length; i++)
			a[i] = sc.nextInt();

		int max=a[0];
		for(i=1; i<a.length; i++)
			if(a[i]>max)
				max=a[i];
		
		System.out.println("Max Element = "+max);
	}	
	public static void main(String[]args)
	{	
		LargeNum ob = new LargeNum();
		ob.large();		
	}	
}