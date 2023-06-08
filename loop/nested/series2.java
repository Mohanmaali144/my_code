/* 

*/

import java.util.Scanner;

class Series2
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int i=1;
	
	
		while(i<=2)
		{	int j=1;
			while(j<=2)
			{					
			    int k=1;
				while(k<=5)
				{
					System.out.println(i+" "+j+" "+k);
				k++;
				}
				j++;
			}
			i++;
		}	
}

}
