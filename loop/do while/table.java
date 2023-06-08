import java.util.Scanner;
class Table
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int tab = 0,sum=0;   
	do
	{
      tab = n*i;	  
	  System.out.println(n+" * "+i+" = "+tab);
	    
	 i++;	 
	}while(i<=10);
}
}