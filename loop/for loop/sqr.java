import java.util.Scanner;

class Sqr
{
 public static void main (String[]arg)
 {
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a num");
 int n = sc.nextInt();
 int i;
	
 for(i=1; i<=n; i++)
	 System.out.print (i*i+" ");
 
}}