import java.util.Scanner;
class Sqr
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int sqr=0;   
	do
	{
      sqr = i*i;	  
	  System.out.print(sqr+" ");
	    
	 i++;	 
	}while(i<=n);
}
}