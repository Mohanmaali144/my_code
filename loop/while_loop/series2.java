import java.util.Scanner;
class Series
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,sum=0;

    
	while(i<=n)
	{	
      
	 if(i%2==0)
	 {
		 sum -=i;
	 }
	 else
	 {
		 sum +=i;
	 }
	 i++;
	}
	System.out.println(" sum = "+sum);
	

	
}
}