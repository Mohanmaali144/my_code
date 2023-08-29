import java.util.Scanner;
interface Program {
	
	int sum(int a,int b);
}
class Main {
		
		public static void main(String[]args)
		{
			Program ob=(a,b) -> (a+b);
			System.out.println(ob.sum(4,6));
		}
}