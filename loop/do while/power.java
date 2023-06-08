

import java.util.Scanner;
class Power
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();

int i=1,pow=1;
  
	do
	{
     pow= pow*x;
	
	 i++;	 
	}while(i<=y);
		
	System.out.println(x+"^"+y+" = "+pow);	
}
}