import java.util.Scanner;
class Test
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
   int a = sc.nextInt();
   System.out.println("a =  "+a);
   a--;
   System.out.println("a =  "+a);
   
   System.out.println("----------------------------------");
   
   System.out.println("a =  "+a);
   a++;
   System.out.println("a =  "+a);
   }
}