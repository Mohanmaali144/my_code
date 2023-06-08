import java.util.Scanner;
class EvenOddSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1,esum=0,osum=0;

    
	do{	 
	 if(i%2==0)
	 {
		 esum +=i;
	 }
	 else
	 {
		 osum +=i;
	 }
	 i++;
	}while(i<=n);
	
	System.out.println("Even sum = "+esum);
	
	System.out.print("Odd sum = "+osum);
	
}
}