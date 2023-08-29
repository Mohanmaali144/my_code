import java.util.Scanner;
class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range:");
		int n=sc.nextInt();
		for(int a=6,b=9,i=1; i<=n ;i++,System.out.println(b),b=b+a*4,a+=4);							
	}
}