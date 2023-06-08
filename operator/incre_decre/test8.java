import java.util.Scanner;
class Test
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
	
	
   System.out.println("Enter value of a");
   int a = sc.nextInt();
   
   
   int b = --a ;
   
   a++;
   b++;
   a--;
   
	System.out.println("a =  "+a);
  
    System.out.println("b =  "+b);
   
  
   }
}