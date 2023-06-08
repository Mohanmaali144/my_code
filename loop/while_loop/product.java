/*product/factorial*/

import java.util.Scanner;
class Product
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
double n = sc.nextInt();
double i=1,pro=1;

	while(i<=n)
	{
		pro *=i;
		i++;
	}
	
	System.out.println("product = "+pro);
}
}