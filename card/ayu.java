import java.util.Scanner;
import java.lang.System;
class Ayusman
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

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
}
}