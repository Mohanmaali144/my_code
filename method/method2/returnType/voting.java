/*Eligible for voing or not  */
import java.util.Scanner;
class Voting
{  
	public boolean canVote(int x)
	{	
		if(x>=18)
		{
			return true;
		}
		else
		{	
			return false;
		}
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int n= sc.nextInt();	
		if((new Voting().canVote(n)))	
			System.out.println("you can vote");
		else
		 System.out.println("you can Note vote");
	}
}
