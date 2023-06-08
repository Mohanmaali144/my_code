import java.util.Scanner;

class Ayu
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a card name");
String cardname=sc.nextLine();
System.out.println("Enter a name");
String name=sc.nextLine();
System.out.println("Enter a DOB");
String DOB=sc.nextLine();
System.out.println("Enter a gender");
String gender=sc.nextLine();
System.out.println("____________________________________________ ");
System.out.println("|              "+cardname+"                |");
System.out.println("| _________                                 |");
System.out.println("||         | NAME"+name+"      \t\t    |");
System.out.println("||         | DOB"+DOB+"    \t            |");
System.out.println("||         | GENDER"+gender+"      \t            |");
System.out.println("||         |                                |");
System.out.println("||_________|                    ******      |");
System.out.println("|                               ******      |");
System.out.println("|    |||||||||||||||||          ******      |");
System.out.println("|        QWRT23456                          |");
System.out.println("|___________________________________________|");
}
}
