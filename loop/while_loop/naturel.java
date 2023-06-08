import java.util.Scanner;
class Naturel
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number number:   ");
int n = sc.nextInt();
int sum =0;
int i=1;
	while(i<=n)
	{
		sum=sum+i;
		i++;
	}
	System.out.println("sum = "+sum);
}
}