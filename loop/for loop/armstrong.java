import java.util.Scanner;
// for three digit
class Armstrong
{
public static void main(String[]arg)
 {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a num");  
	  int n = sc.nextInt();
	  int temp=n,arm=0 ;
	  
	  for( ; n>0; )
	  {
		  int r = n%10;
		  arm += (r*r*r);
		  n/=10;
	  }

	  if(temp==arm)
		  System.out.println("Armstrong");
	   
	   else
		   System.out.println("Not Armstrong"); 
 }
}
