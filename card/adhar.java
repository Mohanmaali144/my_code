/*ADHAR CARD VALUE INPUT FROM THE USER*/

import java.util.Scanner;
class Aadhar

{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Name"); 
String Name = sc.nextLine();
System.out.println("Enter  DOB"); 
 String DOB = sc.nextLine();
 System.out.println("Enter  Gender"); 
 String Gender = sc.nextLine();
 System.out.println("Enter a num"); 
 String num = sc.nextLine();
System.out.println("_____________________________________________");
System.out.println("|            Government Of India             |");
System.out.println("| _________                                  |");
System.out.println("||         |  "+Name+"     \t\t     |");
System.out.println("||         |  "+DOB+"                     |");
System.out.println("||         |  "+Gender+"                 \t     |");
System.out.println("||         |                                 |");
System.out.println("||_________|                                 |");
System.out.println("|                                            |");
System.out.println("|            "+num+"                  |");
System.out.println("|       vid :  9152 5660 9856 0923           |");
System.out.println("|____________________________________________|");
}
}