//2^1/1 - 2^2/2 + 2^3/3 - 2^4/4 + 2^5/5


import java.util.Scanner;
class Power5
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;
	 
	 if(i%2==0)
	 {
	 System.out.print(" - "+x+"^"+i+"/"+i);
	 sum=sum-(power/i);
	 }
	 else
	 {
	 
	 sum=sum+(power/i);
	 if(i>1)
		 System.out.print(" + ");	  
	 System.out.print(x+"^"+i+"/"+i);
	 }
	 i++;
 }
 
	System.out.println(" = "+sum);
  }
   }