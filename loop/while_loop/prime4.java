import java.util.Scanner;
class Prime4
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2,flag=1;

    
	while(i<n)
	{		 
	
		if(n%i==0)
		{   
			flag=0;
			break;
		}
	i++;
	}
	
	if(flag==1 && n!= )
		System.out.println("prime number:   ");
	else
	{
		System.out.println("Not prime number:   ");
	}
	
}
}