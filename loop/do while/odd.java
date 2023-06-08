

import java.util.Scanner;
class Odd
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
  
	do
	{
     
	 int odd = i*2-1;
		 System.out.print(odd+" ");
	 
	 i++;	 
	}while(i<=n);
		

}
}