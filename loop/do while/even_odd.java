

import java.util.Scanner;
class EvenOdd
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
  
  System.out.print("Even num : ");
	do
	{       int even = 2*i;
			System.out.print(even+" ");
	 i++;	 
	}while(i<=n);
	
	i=1;
	System.out.print("\nOdd num : ");
	do
	{       
			int odd = 2*i-1; 
			System.out.print(odd+" ");
	 i++;	 
	}while(i<=n);		

}
}