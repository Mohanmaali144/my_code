//2^1/1 - 2^2/2 + 2^3/6 - 2^4/24 + 2^5/120


import java.util.Scanner;
class Power23
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,fact=1; 
double pow=1,sum=0;
 
   do{
	 pow = pow * x;
	 fact=fact*i;
	 if(i%2==0)
	 {
	 System.out.print(" - "+x+"^"+i+"/"+fact);
	 sum=sum-(pow/fact);
	 }
	 else
	 {
	 
	 sum=sum+(pow/fact);
	 if(i>1)
		 System.out.print(" + ");	  
	 System.out.print(x+"^"+i+"/"+fact+);
	 }
	 i++;
	}while(i<=y);
 
	System.out.println(" = "+sum);
  }
   }