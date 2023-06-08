import java.util.Scanner;
class SMax
{  
	public int sMax(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		int i;
		System.out.println("Enter Elememnt");
		for(i=0; i<b.length; i++)
			b[i] = sc.nextInt();
		
		int max=b[0];
		for(i=1; i<b.length; i++)
			if(b[i]>max)
				max=b[i];
		int smax = 0;
		for(i=1; i<b.length; i++)
			if(b[i]>smax&& b[i]<max)
				smax=b[i];
			
		return smax;
	}	
	public static void main(String[]args)
	{	
		int a[] = new int [5];
		SMax ob = new SMax();	
        System.out.println("Second max i= "+ob.sMax(a));	
		
	}	
}