import java.util.Scanner;

class Duplicate {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter element");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		int b[] = new int[5];
		int k=0;
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				b[k]=a[i];
				k++;
			}
		}
		System.out.println("---------------------------------------------------");
		for(int i=0; i<5; i++)
		{
			System.out.println(b[i]);
		}
	}

}