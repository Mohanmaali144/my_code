
import java.util.Scanner;

class Cone1
{
	
	public void area()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter redius of cone: " );
		float redius = sc.nextFloat();
		System.out.print("Enter Hgiht cone: " );
		float height = sc.nextFloat();
		float area = 3.14f *redius*(redius+redius+height);
		System.out.print("area of cone : "+area);
	}
	
	public static void main(String[]args)
	{
	Cone1 ob = new Cone1();	
		ob.area();

	}
}