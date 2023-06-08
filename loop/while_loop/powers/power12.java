


import java.util.Scanner;
class Power12
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
	 System.out.print(" + "+x+"^"+i+"/"+j);
	 sum=sum+(power/j);
	 }
	 else
	 {
	 
	 sum=sum-(power/j);
	
	  
	 System.out.print(" - "+x+"^"+i+"/"+j);
	 }
	 i++;
	 j++;
 }
 
	System.out.println(" = "+sum);
  }
   }