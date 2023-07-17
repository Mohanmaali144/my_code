import java.util.Scanner;

interface Absolute {
	int absolute (int n);
}
class BL {	
	Absolute Ab = (n)->  n<0?(n=(~n)+1):n;
}

class Main {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		BL ob = new BL();
		System.out.println("Enter a number");
		int num = sc.nextInt();	
		System.out.println("Absolute : "+ob.Ab.absolute(num));
	}
}