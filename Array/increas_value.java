import java.util.Scanner;
class IncreasValue
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[10];
		int i=0,m=2;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<10; i++)
			a[i]= sc.nextInt();	
		
		for(i=0; i<10; i++)
			     if(m==i)
				 {
					 a[i]=a[i]+5;
					 m+=3;
				 } 
			
		for(i=0; i<10; i++)
		System.out.println("a["+i+"] = "+ a[i]);	
	}	
}	
		