import java.util.Scanner; 
class Marksheet
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
System.out.println("Enter a Roll"); 
 String Roll = sc.nextLine();
 System.out.println("Enter a Course");
 String course = sc.nextLine();
 System.out.println("Enter a Name");
 String name = sc.nextLine();
 System.out.println("Enter a Branch");
 String Branch = sc.nextLine();
 System.out.println("Enter a FName");
 String FName = sc.nextLine();
 System.out.println("Enter a Sem");
 String Sem = sc.nextLine();
 System.out.println("Enter a MName");
 String MName = sc.nextLine();
 System.out.println("Enter a year");
 int year = sc.nextInt();
 System.out.println("Enter your marks in Physics");
 int p = sc.nextInt();
 System.out.println("Enter your marks in Chemistry");
 int c = sc.nextInt();
 System.out.println("Enter your marks in Maths");
 int m =sc.nextInt();
 System.out.println("Enter your marks in Hindi");
 int h = sc.nextInt();
 System.out.println("Enter your marks in English");
 int e =sc.nextInt();
 System.out.println("\t\t\t\tRGPV-BHOPAL\t\t\t\t");                                           
 System.out.println("Roll\t:"+Roll+ "\t\t\t\t\t\t Course:"+course);
 System.out.println("Name\t:"+name+ "\t\t\t\t\t Branch:"+Branch);
 System.out.println("FName\t:"+FName+ "\t\t\t\t\t Sem:"+Sem);
 System.out.println("MName\t:"+MName+ "\t\t\t\t\t year:"+year);
 System.out.println("\n\tSubCode  SubName      MaxMark      MinMark  ObtMarks   status");
 System.out.print("\tCSE-501    Physics        100           33       "+p );
 if(p>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-502    Chemistry      100           33       "+c);
 if(c>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-503    Mahts          100           33       "+m);
 if(m>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-504    Hindi          100           33       "+h);
 if(h>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-505    English        100           33       "+e);
 if(e>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
}
}