

import java.util.Scanner;
class EvenSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,sum=0;
  
	do
	{
     
	 int even = i*2;
		 System.out.print(even);
		 sum=sum+even;
		 if(i<n)
			System.out.print(" + ");
	 i++;	 
	}while(i<=n);
	
			System.out.print(" = "+sum);

}
}