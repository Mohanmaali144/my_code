import java.util.Scanner;
class Test
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
	
	
   System.out.println("Enter value of a");
   int a = sc.nextInt();
   
   System.out.println("Enter value of b");
   int b = sc.nextInt();
   
   
	a--;
	System.out.println("a =  "+a);
  
	b = a++;
    System.out.println("b =  "+b);
   
  
   }
}