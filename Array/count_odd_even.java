import java.util.Scanner;
class CountOddEven
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[5];
		int i=0,odd=0,even=0;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<5; i++)
		{	
			a[i]= sc.nextInt();	
		}
		
		for(i=0; i<5; i++)
		{
			if(a[i]%2==0)
			{	
				even++;
			}
			else
			{	
				odd++;
			}
		}
		System.out.println("Even Element  "+even+" time");
		System.out.println("Odd Element is  "+odd+" time");	
	}	
}	
		