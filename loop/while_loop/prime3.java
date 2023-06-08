import java.util.Scanner;
class Prime3
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2;

    
	while(i<n)
	{		 
	
		if(n%i==0)
		{ 
			break;
		}
	i++;
	}
	
	if(i==n  )
		System.out.println("prime number:   ");
	else
	{
		System.out.println("Not prime number:   ");
	}
	
}
}