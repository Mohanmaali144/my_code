// 1/2^1 - 3/2^2 + 5/2^3 - 7/2^4 + 9/2^5 = 0.21875

import java.util.Scanner;
class Pow20
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number:   ");
int x = sc.nextInt();

System.out.println("Enter power :   ");
int i,j=1,y = sc.nextInt();
double sum=0,pow=1;
     
	 for(i=1; i<=y; i++,j+=2)
	 {   
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
	}
	 
	 
		 System.out.println(" = "+sum);
}
}