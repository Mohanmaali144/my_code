import java.util.Scanner;
class Test
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
   char ch = sc.next().charAt(0);
   
   System.out.println("ch =  "+ch);
   ch--;
   System.out.println("ch =  "+ch);
   }
}