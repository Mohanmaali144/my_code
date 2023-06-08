/*print series sum ///- Switch case */
/*05/05/023*/

import java.util.Scanner;
class FactorialSwitch7
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("\tChoice are....");
System.out.println("\n\t press 1 for : 1/!1 + 2/!2 + 3/!3 + 4/!4 + 5/!5");
System.out.println("\t press 2 for :  1/!1 - 2/!2 + 3/!3 - 4/!4 + 5/!5");
System.out.println("\t press 3 for : - 1/!1 + 2/!2 - 3/!3 + 4/!4 - 5/!5");

System.out.println("\n\tEnter choice..");

int ch = sc.nextInt();


int i=1,n;
double sum=0,fact=1;

switch(ch)
{  
	
	case 1:
		System.out.println("\n\tEnter number: ");
		n = sc.nextInt();
		while(i<=n)
		{			
			fact *=i;
			sum = sum + (i/fact);	
			if(i>1)
			{
				System.out.print(" + ");
			}
			System.out.print(i+"/!"+i);		
			i++;
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
				fact *=i;
				sum = sum - (i/fact);
				
					System.out.print(" - "+i+"/!"+i);
				
				
			}
			else
			{			
				fact*=i;
				sum = sum + (i/fact);
				
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"/!"+i);			
			}
			i++;
		}
	
			System.out.println(" = "+ sum);
	break;
	
	
	case 3:
		 System.out.println("\n\tEnter number: ");
		 n = sc.nextInt();
		while(i<=n)
		{
			if(i%2==0)
			{
				
				fact=fact*i;			
				sum= sum +(i/fact);				
				System.out.print(" + "+i+"/!"+i);				
			}
			else
			{		
				fact =fact*i;		
				sum= sum - (i/fact);
				System.out.print(" - "+i+"/!"+i);
				
			}
			i++;
		}
	
		System.out.println(" = "+ sum);
				
	break;
	
	default:
		System.out.println(" Invalid choice..!!");
}


}
}