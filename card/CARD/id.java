import java.util.Scanner;
class Id
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Ente your school name");
String schoolname = sc.nextLine();
System.out.println("Ente your name");
String name = sc.nextLine();
System.out.println("Ente your DOB");
String DOB = sc.nextLine();
System.out.println("Ente your Class");
String Class = sc.nextLine();
System.out.println("Ente your father name");
String fathersname = sc.nextLine();
System.out.println("Ente your mobile No");
String mobileno= sc.nextLine();
System.out.println("____________________________________________ ");
System.out.println("|            "+schoolname+"\t    |");
System.out.println("| _________                                 |");
System.out.println("||         | NAME:"+name+"\t            |");
System.out.println("||         | DOB:"+DOB+"                 |");
System.out.println("||         | CLASS:"+Class+"      \t\t    |");
System.out.println("||         | FATHERNAME:"+fathersname+"\t    |");
System.out.println("||_________| MOBILENO.:"+mobileno+"\t    |");
System.out.println("|                                           |");
System.out.println("|Principal                                  |");
System.out.println("|                                           |");
System.out.println("|___________________________________________|");
}
} 
