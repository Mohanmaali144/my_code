// complete..
// hashCode Method
import java.util.Scanner;
class Test
{
	public String add()
	{
		return "kamal";
	}	
	public static void main(String[]args)
	{
		Test ob  =new Test();
		Test ob2 =new Test();
		Test ob3 =new Test();
		Test ob4 =new Test();
		//Test ob5 =new Test();
		System.out.println(ob.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println (new Test().add().hashCode());		
	}		
}	