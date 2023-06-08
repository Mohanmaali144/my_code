

import java.util.Scanner;
class OddSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,sum=0;
  
	do
	{
     
	 int odd = i*2-1;
		 System.out.print(odd);
		 sum=sum+odd;
		 if(i<n)
			System.out.print(" + ");
	 i++;	 
	}while(i<=n);
	
			System.out.print(" = "+sum);

}
}