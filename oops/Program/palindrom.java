import java.util.Scanner;
class Palindrome
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public void isPalindrome()
	{  
		int s=0,n=this.n;
		while(n!=0)
		{
			int r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==this.n)
			System.out.println("palindrom");
		else
			System.out.println("Not palindrom");
	}
}
class Test
{
	public static void main(String args[])
	{
		Palindrome ob=new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ob.setData(n);
		ob.isPalindrome();
	}
}