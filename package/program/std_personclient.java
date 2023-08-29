import java.util.Scanner;
import personstudent.Student;
class StdPersonClient
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);	
		Student ob = new Student();
		
		System.out.println("Enter name of Person");
		ob.setName(sc.next());
		
		System.out.println("Enter age of Person");
		ob.setAge(sc.nextInt());
		
		System.out.println("Enter roll number ");
		ob.setRoll(sc.nextInt());
		
		System.out.println("Enter Height of Person");
		ob.setHeight(sc.nextFloat());
		
		System.out.println("Enter weight of Person");
		ob.setWeight(sc.nextInt());		
		int ch;
		do{
			System.out.println("Enter Gender of Person\n\t1 for male\n\t2 for female\n\t3 for Exite");
			 ch = sc.nextInt();
			switch(ch)	
			{
				case 1: 
					ob.setGender("male");
				break;	
				case 2:
					ob.setGender("female");
				break;
			}				
		}while((ch!=3) && (ch!=2) && (ch!=1));			
		System.out.println("Enter class");
		ob.setClas(sc.next());
		System.out.println("Enter Fees");
		ob.setFees(sc.nextInt());

		System.out.println("------------------------------------------------");
		System.out.println("\tName : "+ob.getName());
		System.out.println("------------------------------------------------");
		System.out.println("\tRoll : "+ob.getRoll());
		System.out.println("------------------------------------------------");
		System.out.println("\tClass : "+ob.getClas());
		System.out.println("------------------------------------------------");
		System.out.println("\tgender : "+ob.getGender());
		System.out.println("------------------------------------------------");
		System.out.println("\tAge : "+ob.getAge());
		System.out.println("------------------------------------------------");
		System.out.println("\tHeight : "+ob.getHeight());
		System.out.println("------------------------------------------------");
		System.out.println("\tWeight : "+ob.getWeight());
		System.out.println("------------------------------------------------");
	}	
}