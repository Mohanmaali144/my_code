import java.util.Scanner;

class Pelindrom
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int rev=0,temp=n ;
  
  for( ; n>0; )
  {
	  int r = n%10;
	  rev = (rev*10)+r;
	  n/=10;
	  
  }
  if(temp==rev)
	System.out.println("Pelindrom number"); 
	  
  else
	  System.out.println("Not Pelindrom number"); 
  
}
}