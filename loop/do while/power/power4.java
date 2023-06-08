// 2^1/1 + 2^2/2 + 2^3/3 + 2^4/4 + 2^5/5

import java.util.Scanner;
class Power4
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1;
double sum=0,pow=1;
     
	 do{
		 pow = pow*x;
		 
		 sum+=(pow/i);
		 System.out.print(x+"^"+i+"/"+i);
		 if(i<y)
			  System.out.print(" + ");
		 i++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}