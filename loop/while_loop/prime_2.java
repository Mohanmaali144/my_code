import java.util.Scanner;
class Prime2
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=2,a=0;

    
	while(i<n)
	{	
    
	 
	
	if(n%i==0) 
		System.out.println("Not prime number:   ");
	
	
	
	else
		System.out.println("prime number:   ");
	i++;
	}
}
}