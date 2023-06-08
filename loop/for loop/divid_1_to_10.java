import java.util.Scanner;
class Divid
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= sc.nextInt();
		int i,count=0;	
		for(i=1; ; i++)
		{
			if(i%1==0 && i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 && i%10==0 )
			{	System.out.println(">>> "+i);
				count++;
			}
			if(count==n)break;			
		}	
	}
}	