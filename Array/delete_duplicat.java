import java.util.Scanner;
class DeleteDuplicat
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[5];
		int i=0,m=0;
		System.out.println("Enter eliment in Array: ");	
		for(i=0; i<5; i++)
			a[i]= sc.nextInt();	
		
		int b[]= new int[5];
		for(i=0; i<5; i++)
		{	
			for(int j=i+1; j<5; j++)
		   { 
				 if(a[i]!=a[j]&& a[i]!=-1)				
						b[i]=a[i];				
				 else
					a[j]=-1;
		   }
		}		
		for(i=0; i<b.length; i++)
		System.out.println("a["+i+"] = "+ b[i]);	
	}	
}	
		