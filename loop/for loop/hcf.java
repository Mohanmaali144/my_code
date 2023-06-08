import java.util.Scanner;

class Hcf
{
public static void main(String[]arg)
 {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first num");  
	  int n1 = sc.nextInt();
	  
	  System.out.println("Enter Second num");  
	  int n2 = sc.nextInt();
	  int i;
	  
	  for(; n1!=n2; )
	  {
		if(n1>n2)
				n1=n1-n2;
			
		else
			n2=n2-n1;		
	  }
	int hcf= n1;
	System.out.println("Hcf is: "+hcf);  
}}