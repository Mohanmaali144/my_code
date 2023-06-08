/*print series sum ///- Switch case */
/*05/05/023*/

import java.util.Scanner;
class FactorialSwitch5
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("\tChoice are....");
System.out.println("\n\t press 1 for : 2/!1 + 3/!2 + 4/!3 + 5/!4 + 6/!5");
System.out.println("\t press 2 for : 2/!1 + 3/!2 - 4/!3 + 5/!4 - 6/!5");
System.out.println("\t press 3 for : 2/!1 - 3/!2 + 4/!3 - 5/!4 + 6/!5");

System.out.println("\n\tEnter choice..");

int ch = sc.nextInt();


int i=1,j=2,n;
double sum=0,fact=1;

switch(ch)
{  
	
	case 1:
		System.out.println("\n\tEnter number: ");
		n = sc.nextInt();
		while(i<=n)
		{
			fact = fact*i;	
			sum=sum+(j/fact);
			if(i>1)
			System.out.print(" + ");

		
			System.out.print(j+"/!"+i);
			i++;
			j++;
		}
	
			System.out.println(" = "+ sum);
	break;
	
	case 2:
			System.out.println("\n\tEnter number: ");
			n = sc.nextInt();
		while(i<=n)
		{
		
			if(i%2==0)
			{
			fact = fact*i;	
			sum=sum+(j/fact);;
			if(i>1)
			System.out.print(" + ");

		
			System.out.print(j+"/!"+i);
			}
			
			else
			{
			fact = fact*i;	
			sum=sum-(j/fact);;
			if(i>1)
			System.out.print(" - ");

		
			System.out.print(j+"/!"+i);
			}
			
			i++;
			j++;
		}
	
			System.out.println(" = "+ sum);
	break;
	
	
	case 3:
		 System.out.println("\n\tEnter number: ");
		 n = sc.nextInt();
		while(i<=n)
		{
			fact = fact*i;	
			
			if(i%2==0)
			{
			
			sum=sum-(j/fact);;
			if(i>1)
			System.out.print(" - ");

			System.out.print(j+"/!"+i);
			}
			
			else
			{
		
			sum=sum+(j/fact);;
			if(i>1)
			System.out.print(" + ");

		
			System.out.print(j+"/!"+i);
			}
			
			i++;
			j++;
		}
	
			System.out.println(" = "+ sum);
	
	break;
	
	default:
		System.out.println(" Invalid choice..!!");
}


}
}