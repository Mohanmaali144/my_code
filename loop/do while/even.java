

import java.util.Scanner;
class Even
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
  
	do
	{
     
	 int even = i*2;
		 System.out.print(even+" ");
	 
	 i++;	 
	}while(i<=n);
		

}
}