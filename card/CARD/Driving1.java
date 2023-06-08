import java.util.Scanner;
class Driving
{
 public static void main(String args[])
 {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a issue date"); 
  String issuedate = sc.nextLine(); 
  System.out.println("Enter a validity"); 
  String validity = sc.nextLine();
  System.out.println("Enter a name"); 
  String name = sc.nextLine();
  System.out.println("Enter a DOB"); 
  String DOB = sc.nextLine();
  System.out.println("Ente your son/daughter/wife");
  String sondaughterwife = sc.nextLine();
  System.out.println("Ente your addres");
  String addres = sc.nextLine();
  System.out.println("Ente your blood group");
  String bloodgroup = sc.nextLine();
  System.out.println("_____________________________________________________________");
  System.out.println("|____        Indian Union Driving Licence         _________  |"); 
  System.out.println("||   |        Issued MADHYA PRADESH               |        | |");
  System.out.println("||___|         MP13N-2002-089765                  |        | |");
  System.out.println("|   Issue Date:"+issuedate+"       Validity(TR)      |        | |");
  System.out.println("|                                                 |________| |");
  System.out.println("|   Validity:"+validity+"                     Signature       |");
  System.out.println("|                                                            |");
  System.out.println("| Name:"+name+"                                           |");
  System.out.println("| DOB:"+DOB+"                                             |");
  System.out.println("| Son/Daughter/wife:"+sondaughterwife+"\t\t\t     |");
  System.out.println("|                                                            |");
  System.out.println("| Addres:"+addres+"\t\t\t\t     |");
  System.out.println("|                                                            |");
  System.out.println("| Blood Group:"+bloodgroup+" \t\t\t\t\t     |");
  System.out.println("|____________________________________________________________|");  
  
 }


}
