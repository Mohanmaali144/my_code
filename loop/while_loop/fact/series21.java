/*  !1/1 + !2/3 + !3/5....   */
/*04/05/2023*/
import java.util.Scanner;
class Series21
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int i=1,j=1,n = sc.nextInt();
double sum=0,fact=1;

	while(i<=n)
	{    
        fact = fact*i;
			sum=sum+(fact/j);
			
			if(i>1)
			System.out.print(" + ");	
			System.out.print("!"+i+"/"+j);
		
		i++;
		j+=2;
	}
	
	System.out.println(" = "+ sum);
}
}