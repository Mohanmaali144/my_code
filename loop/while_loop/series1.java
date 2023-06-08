import java.util.Scanner;
class Series
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number number:   ");
int n = sc.nextInt();
int ans =1;
int i=1;
    System.out.print("Sum of naturel is: ");
	while(i<=n)
	{
	 
	 System.out.print(" "+ans);
	 ans=i+ans;
	 i++;
	 
	}
	
}
}