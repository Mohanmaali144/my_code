import java.util.Scanner;

class Main {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		
		try{
			System.out.println(a[-1]);
		}
		catch( ArrayIndexOutOfBoundsException  ref)
		{
			System.out.println(ref.getMessage());
			System.out.println(ref.getClass());
			
			System.out.println("invalid index");
		}
		System.out.println("continue......");
	}

}