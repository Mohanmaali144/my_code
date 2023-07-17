import java.util.Scanner;

interface Reverse {
	
	int reverse (int n);
}
class BL {
	
	Reverse ob =(n)-> {
			int rev=0;
			while(n>0)
			{
				int re = n%10;
				rev = rev*10+re;
				n/=10;
			}
			return rev;
		};
}

class Main {
	public static void main(String []args)
	{
	
		Scanner sc = new Scanner(System.in);
		BL obj = new BL();
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Reverse = "+obj.ob.reverse(n));
		
	}
}
