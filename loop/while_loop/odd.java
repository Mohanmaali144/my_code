import java.util.Scanner;
class Odd
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int ans=0;

    System.out.print("Odd num is: ");
	while(i<=n)
	{		 
		 ans = i*2-1;
		 System.out.print(ans+" ");
	 	 
	 i++;
	}
}
}