import java.util.Scanner;
// for any number
class Armstrong2
{
	public static void main(String[]arg)
	 {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a num");  
		  int n = sc.nextInt();
		  int temp=n,arm=0,count=0 ;
		  
		  for( ; n>0; n/=10,count++ );
			n=temp;
		  for( ; n>0 ;)
		  {
			 int r = n%10;
			 int i=1,pow=1;
		 
			 for(i=1; i<=count; i++, pow*=r);		 
			 arm+=pow;
			 n/=10;
		  }
		  if(temp==arm)
				System.out.println("Armstrong"); 		
		  else
			System.out.println("Not Armstrong");  		
	 }
}