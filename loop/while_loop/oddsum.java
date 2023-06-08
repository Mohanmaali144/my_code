import java.util.Scanner;
class OddSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int ans=0;
int sum=0;
    
	while(i<=n)
	{		 
		
		sum=sum+(i*2-1);
	 	 
	 i++;
	}
	System.out.print("sum of odd number = "+sum);
}
}