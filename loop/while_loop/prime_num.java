import java.util.Scanner;
class Prime
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,a=0;

    
	while(i<=n)
	{		 
	
		if(n%i==0)
		{ 
			a++;
		}
	i++;
	}
	
	if(a==2  )
		System.out.println("prime number:   ");
	else
	{
		System.out.println("Not prime number:   ");
	}
	
}
}