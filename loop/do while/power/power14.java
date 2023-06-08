// 2/2^1 - 3/2^2 + 4/2^3 - 5/2^4 + 6/2^5

import java.util.Scanner;
class Power14
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
		 
		 if(i%2==0)
		 {	 
		 sum-=(j/pow);
		 System.out.print(" - "+j+"/"+x+"^"+i);
		 }
	    else
		{
			
				if(i>1)
				System.out.print(" + ");
			    sum+=(j/pow);
			 System.out.print(j+"/"+x+"^"+i);
			
		}  
		 i++;
		 j++;
	 }while(i<=y);
	 
		 System.out.println(" = "+sum);
}
}