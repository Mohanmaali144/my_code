/*  2/1! + 3/!2 + 4/!3....   */
/*04/05/2023*/

import java.util.Scanner;
class Series12
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int i=1,j=2,n = sc.nextInt();
double sum=0,fact=1;

	while(i<=n)
	{
		fact = fact*i;	
		sum=sum+(j/fact);
		if(i>1)
		System.out.print(" + ");

	
		System.out.print(j+"/!"+i);
		i++;
		j++;
	}
	
	System.out.println(" = "+ sum);
}
}