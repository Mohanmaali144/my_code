// 2/2^1 + 3/2^2 + 4/2^3 + 5/2^4 + 6/2^5

import java.util.Scanner;
class Power13
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int y = sc.nextInt();
int i=1,j=2;
double sum=0,pow=1;
     
	 do{
		 pow = pow*x;
		 
		 sum+=(j/pow);
		 System.out.print(j+"/"+x+"^"+i);
		 if(i<y)
			  System.out.print(" + ");
		 i++;
		 j++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}