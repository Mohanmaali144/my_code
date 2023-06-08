
//1!/2^1 + 2!/2^2 + 6!/2^3 + 24!/2^4 + 120!/2^5 = 7.0
import java.util.Scanner;
class Pow25
{
public static void main(String[]arg)
 {
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,fact=1,y = sc.nextInt();
float sum=0,pow=1;
     
	 for(i=1; i<=y;i++,fact*=i)
	 {	
		 pow*=x;
		 sum=sum+(fact/pow);
		 System.out.print(fact+"!"+"/"+x+"^"+i);
		 if(i<y)
			  System.out.print(" + ");
	 }	 
		 System.out.println(" = "+sum);
 }
}