//2^1/1 + 2^2/2 + 2^3/3 + 2^4/4 + 2^5/5


import java.util.Scanner;
class Power4
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
	 System.out.print(x+"^"+i+"/"+i);
	 sum=sum+(power/i);
	 if(i<y)
		 System.out.print(" + ");
	 i++;
 }
 
	System.out.println(" = "+sum);
  }
   }