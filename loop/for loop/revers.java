import java.util.Scanner;

class Revers
{
 public static void main (String[]arg)
 {
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a num");
 int n = sc.nextInt();
 int i,r,rev=0;
   for(; n>0; )
   {
	  r = n%10;
	  rev=(rev*10)+r;
	  n/=10;
   }
   System.out.print("Revers num is : "+rev);
 }
}