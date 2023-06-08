
/*only even number n term time*/
import java.util.Scanner;
class Even
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int ans=0;

    System.out.print("Even num is: ");
	while(i<=n)
	{		 
		 ans = ans+2;
		 System.out.print(ans+" ");
	 	 
	 i++;
	}
}
}