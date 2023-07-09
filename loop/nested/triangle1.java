/* 
12345
1234
123
12
1
*/
import java.util.Scanner;

class Triangle1
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i=n;
	
	while(i>=1)
	{    
		int j=1;
		while(j<=i)
		{
			System.out.print(j);
			j++;
		}
		System.out.println();
		i--;
	}
}

}
