//2^1/1 + 2^2/3 + 2^3/5 + 2^4/7 + 2^5/9

import java.util.Scanner;
class Power16
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,j=1; 
double power=1;
double sum=0;

 while(i<=y)
 {
	 power = power * x;
	 System.out.print(x+"^"+i+"/"+j);
	 sum=sum+(power/j);
	 if(i<y)
		 System.out.print(" + ");
	 i++;
	 j+=2;
 }
 
	System.out.println(" = "+sum);
  }
   }