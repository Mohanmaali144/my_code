

import java.util.Scanner;
class Cube
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int cube=0;   
	do
	{
      cube = i*i*i;	  
	  System.out.print(cube+" ");  
	 
	 i++;	 
	}while(i<=n);
			
}
}