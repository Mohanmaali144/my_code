//  1/2^1 + 2/2^2 + 3/2^3 + 4/2^4 + 5/2^5

import java.util.Scanner;
class Power7
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
		 
		 sum+=(i/pow);
		 System.out.print(i+"/"+x+"^"+i);
		 if(i<y)
			  System.out.print(" + ");
		 i++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}