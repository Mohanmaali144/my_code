import java.util.Scanner;
class Hcf
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number:   ");
int num1 = sc.nextInt();

System.out.println("Enter second number:   ");
int num2 = sc.nextInt();


	do
	{ 
		if(num1==num2)
			break;
		
		else if(num1<num2)
		{
			num2=num2-num1;
		}
		else
		{
			num1=num1-num2;
		}
	} while(num1!=num2);
	
	
   int hcf=num2;
   System.out.println("Hcf is : "+hcf);
 
	}	
}