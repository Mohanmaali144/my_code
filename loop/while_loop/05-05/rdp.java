import java.util.Scanner;
/*revers number some of digit and pelindrom*/
class RDP
{
	public static void main(String[]arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("\n\tchoice aree....");
	System.out.println("\n\tpress 1 for sum of digit of n number");
	System.out.println("\tpress 2 for revers number");
	System.out.println("\tpress 3 for pelindrom number");
	
	System.out.print("\n\tEnter choice: ");
	int ch = sc.nextInt();
	int n,rev=0,r=0,sum=0;
	
	switch(ch)
	{
		case 1:
			System.out.print("\n\tEnter number:  ");
			n =sc.nextInt();
			while(n>0)
			{	
				r=n%10;
				sum+=r;
				n/=10;
			}
			System.out.println("\tSum of Digit = "+sum);
		break;
		
		case 2:
			System.out.print("\n\tEnter number:   ");
			n =sc.nextInt();
			while(n>0)
			{
				r=n%10;
				rev = (rev *10)+r;
				n/=10;
			}
				System.out.println("\trevers number  = "+rev);
		break;
		
		case 3:
			System.out.print("\n\tEnter number: ");
			n =sc.nextInt();
			int temp=n;
			while(n>0)
			{
				r=n%10;
				rev = (rev *10)+r;
				n/=10;
			}

				if(temp==rev)
				{
					System.out.println(temp+ "\tis Palindrom");
				}
				else
					System.out.println(temp+"\tis not palindrom");
		break;
		
		default:
			System.out.println("\tinvalid choice...!!!");
		
	}
	
		
	}
}