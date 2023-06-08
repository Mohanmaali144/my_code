
import java.util.Scanner;

class Average
{
	
	public void average()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter age of person1: " );
		int p1 = sc.nextInt();
		System.out.print("Enter age of person2: " );
		int p2 = sc.nextInt();
		System.out.print("Enter age of person3: " );
		int p3 = sc.nextInt();
		System.out.print("Enter age of person4: " );
		int p4 = sc.nextInt();
		System.out.print("Enter age of person5: " );
		int p5 = sc.nextInt();
		System.out.print("Enter age of person6: " );
		int p6 = sc.nextInt();
		System.out.print("Enter age of person7: " );
		int p7 = sc.nextInt();
		float average = (p1+p2+p3+p4+p5+p6+p7)/7;
		System.out.print("Average of age : "+ average );
	}
	
	
	public static void main(String[]args)
	{
		Average ob = new Average();	
			ob.average();

	}
}