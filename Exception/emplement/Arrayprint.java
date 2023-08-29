
import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		
		
		long a[]= new long[5];
		
		int sum =0;
		System.out.println("Enter Element: ");
		for(int i=0; i<5; i++)
			a[i]=sc.nextLong();
	
		try{
			for(int i=0; i<5; i++){
				System.out.println("a["+i+"]= "+a[i]);
				sum+=a[i+1];
			}
		}
		catch(ArrayIndexOutOfBoundsException ref)
		
		{
			System.out.println("generate Exception");
		}
		
		System.out.println(sum);
	}
}	