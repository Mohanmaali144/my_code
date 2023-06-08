import java.util.Scanner;
class Power
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int x = sc.nextInt();

System.out.println("Enter power:   ");
int y = sc.nextInt();
int i=1,power=1;

    while(i<=y)
	{		 
	 power = power*x;
		
	i++;
	}	
	System.out.println(x+"^"+y+" = "+power);
}
}