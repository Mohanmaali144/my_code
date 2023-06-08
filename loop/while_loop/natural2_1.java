import java.util.Scanner;
class Natural
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number number:   ");
int n = sc.nextInt();
int sum =0;
int i=1;
  
	while(i<=n)
	{	
      sum=sum+i;

	 if(i<n)
	 {
		 System.out.print(i+"+");
	 }
	 
	 i++;
	}
	System.out.print(n+" = "+sum);
}
}