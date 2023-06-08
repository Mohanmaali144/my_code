import java.util.Scanner;
class SMin
{  
	public int sMin(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		int i;
		System.out.println("Enter Elememnt");
		for(i=0; i<b.length; i++)
			b[i] = sc.nextInt();
		
		int smin=a[0];
		
		for(i=0;i<b.length; i++)
			if(smin<a[i])
				smin = b[i];
		
		int min=b[0];
		for(i=1; i<b.length; i++)
			if(b[i]<min)
				min=b[i];
		
		for(i=0; i<b.length; i++)
			if(b[i]<smin&& b[i]>min)
				smin=b[i];
			
		return smin;
	}	
	public static void main(String[]args)
	{	
		int a[] = new int [5];
		SMin ob = new SMin();	
        System.out.println("Second min i= "+ob.sMin(a));	
		
	}	
}