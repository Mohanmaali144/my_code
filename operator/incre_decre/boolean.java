import java.util.Scanner;
class Test
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
   boolean a = true;
   
   System.out.println("a =  "+a);
   a++;  //error
   System.out.println("a =  "+a);
   }
}