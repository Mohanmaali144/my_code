import java.util.Scanner;
class AdharAyu
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("\tCHOICE ARE:");
System.out.println("\tpress 1 for Adhar card ");
System.out.println("\tpress 2 for Ayushman card ");

System.out.println("\nEnter your choice:");
int ch = sc.nextInt();

switch(ch)
{   
	case 1:
		System.out.println("Enter Name"); 
		String Name = sc.next();
		System.out.println("Enter  DOB"); 
		String Dob = sc.nextLine();
		
		System.out.println("Enter  Gender"); 
		String Gender = sc.nextLine();
		
		System.out.println("Enter a num"); 
		String num = sc.nextLine();
		
		System.out.println("_____________________________________________");
		System.out.println("|            Government Of India             |");
		System.out.println("| _________                                  |");
		System.out.println("||         |  "+Name+"     \t\t     |");
		System.out.println("||         |  "+Dob+"                     |");
		System.out.println("||         |  "+Gender+"                 \t     |");
		System.out.println("||         |                                 |");
		System.out.println("||_________|                                 |");
		System.out.println("|                                            |");
		System.out.println("|            "+num+"                  |");
		System.out.println("|       vid :  9152 5660 9856 0923           |");
		System.out.println("|____________________________________________|");
	
	break;
	
	case 1:
		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter date of birth");
		String dob = sc.nextLine();

		System.out.println("Enter Gender");
		String gender = sc.nextLine();

		System.out.println("______________________________________________ ");
		System.out.println("|             AYUSHMAN CARD           \t      |");
		System.out.println("| _________                           \t      |");
		System.out.println("||         | NAME: "+name+"         \t      |");
		System.out.println("||         | DOB: "+dob+"           \t      |");
		System.out.println("||         | GENDER: "+gender+"            \t      |");
		System.out.println("||         |                          \t      |");
		System.out.println("||_________|                    ******\t      |");
		System.out.println("|                               ******\t      |");
		System.out.println("|    |||||||||||||||||          ******\t      |");
		System.out.println("|        QWRT23456                    \t      |");
		System.out.println("|_____________________________________________|");
		break;
}
}
}