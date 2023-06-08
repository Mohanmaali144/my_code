 //- 2/2^1 + 3/2^2 - 4/2^3 + 5/2^4 - 6/2^5


import java.util.Scanner;
class Power15
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,j=2; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;
	 
	 if(i%2==0)
	 {
	 System.out.print(" + "+j+"/"+x+"^"+i);
	 sum=sum+(j/power);
	 }
	 else
	 {
	 
	 sum=sum-(j/power);
	  
	 System.out.print(" - "+j+"/"+x+"^"+i);
	 }
	 i++;
	 j++;
 }
 
	System.out.println(" = "+sum);
  }
   }