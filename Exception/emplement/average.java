import java.util.Scanner;

class Test {
	public static void main(String args[])
	{
		Test ob = new Test();
		System.out.println("Ans = "+ob.calculateAverage(5));
	}
	
	public int calculateAverage(int n){	
		Scanner sc = new Scanner (System.in);
		
		int a[] = new int [5];	
		int avj =0;
		
			
		try{
			for(int i=0; i<5; i++)
			{
				a[i]=sc.nextInt();
			}			
		}
		catch( ArrayIndexOutOfBoundsException ref)
		{
			return 0;
		}
		
		for(int i=0; i<a.length; i++)
			{
				avj += a[i];
			}
			avj = avj/a.length;	
			return avj;
		
	}
}