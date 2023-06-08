/*n term cube */

import java.util.Scanner;
class CubeSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int cube=0,sum=0;

	while(i<=n)
	{		 
		cube = i*i*i;		 
		sum = sum+cube;
		if(i<n)
		{
			System.out.print(cube+" + ");
		}
		i++;
	}
	System.out.print(cube+" = "+sum);
}
}