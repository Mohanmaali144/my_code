import java.util.Scanner;
class Credit
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);

System.out.println("Enter a card name");
String cardname=sc.nextLine();
System.out.println("Enter a num"); 
 String num = sc.nextLine();
System.out.println("Enter a cardholdername"); 
String cardholdername = sc.nextLine();
System.out.println("____________________________________________ ");
System.out.println("|                                           |");
System.out.println("| ______        "+cardname+"                 |");
System.out.println("||      |                                   |");
System.out.println("||      |                                   |");
System.out.println("||______|                                   |");
System.out.println("|                                           |");
System.out.println("|                                           |");
System.out.println("|    "+num+"                    |");
System.out.println("|   "+cardholdername+"        05/19\t\t    |");
System.out.println("|                                           |");
System.out.println("|___________________________________________|");
}
}
