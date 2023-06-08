import java.util.Scanner;
class Income
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a name"); 
  String name = sc.nextLine();
  System.out.println("Ente your father");
  String father = sc.nextLine();
  System.out.println("Enter a DOB"); 
  String DOB = sc.nextLine();
  System.out.println("  ________________________________________________");
  System.out.println(" |INCOME TAX DEPARTMENT\t    GOVT.OF INDIA        |");
  System.out.println(" |__________                                      |");
  System.out.println(" ||        | Parmanent Account Number Card       |");
  System.out.println(" ||        |       OBVRE3456W                    |");
  System.out.println(" ||        |                    *******          |");
  System.out.println(" ||________|                    *******          |");
  System.out.println(" | NAME:"+name+"             *******          |");
  System.out.println(" |                              *******          |"); 
  System.out.println(" | Father's Name:"+father+"\t                 |");
  System.out.println(" |                                               |");         
  System.out.println(" | Date of Birth:"+DOB+"                      |");
  System.out.println(" |                                               |");
  System.out.println(" |_______________________________________________|");    
  }
}