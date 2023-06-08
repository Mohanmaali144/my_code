import java.util.Scanner;
class SecondMax
{  
	public void sMax()
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
		int smax = a[0];
		for(i=1; i<a.length; i++)
			if(a[i]>smax&& a[i]<max)
				smax=a[i];
			
		System.out.println("Secaond Max Element = "+smax);
	}	
	public static void main(String[]args)
	{	
		SecondMax ob = new SecondMax();
		ob.sMax();		
	}	
}