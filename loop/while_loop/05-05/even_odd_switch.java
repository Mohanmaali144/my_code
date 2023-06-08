
/*Even odd sum and series_____switch case______05/05/2023*/

import java.util.Scanner;
class EvenOdd
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("\n\tchoice are...  ");
System.out.println("\n\tpress 1 for Even series..  ");
System.out.println("\tpress 2 for Odd series..  ");
System.out.println("\tpress 3 for sum of Even series..  ");
System.out.println("\tpress 4 for sum of Odd series..  ");
System.out.println("\tpress 5 for sum of naturel num.. ");



System.out.println("\nEnter choice:   ");
int ch = sc.nextInt();
int n,i=1;
int ans=0,sum=0;
 switch(ch)
 {
	 
	case 1:
		System.out.println("\nEnter number:   ");
		n = sc.nextInt();
		System.out.print("Even num is: ");
		while(i<=n)
		{		 
			 ans = i*2;
			 System.out.print(ans+" ");
			 
		 i++;
		}
	break;
	
	case 2:
		System.out.println("\nEnter number:   ");
		n = sc.nextInt();
		System.out.print("Odd num is: ");
		while(i<=n)
		{		 
			 ans = i*2;
			 System.out.print((ans-1)+" ");
			 
		 i++;
		}
	break;
	
	case 3:
		System.out.println("\nEnter number:   ");
		n = sc.nextInt();
		while(i<=n)
		{		 
			 ans = i*2;		 
			 sum = sum+ans;
			 if(i<n)
			 {
				 System.out.print(ans+" + ");
			 }
			 
			i++;
		}
		System.out.print(ans+" = "+sum);
	break;		
	
	case 4:
		System.out.println("\nEnter number:   ");
		n = sc.nextInt();
		while(i<=n)
		{		 
			 ans = ((i*2)-1);		 
			 sum = sum+ans;
			 if(i<n)
			 {
				 System.out.print(ans+" + ");
			 }
			 
			i++;
		}
		System.out.print(ans+" = "+sum);
	break;

	case 5:
		System.out.println("\nEnter number:   ");
		n = sc.nextInt();
		while(i<=n)
		{	
		 sum=sum+i;
		 System.out.print(i);
		 if(i!=n)
		 {
			System.out.print("+");
		 }
		 
		 i++;
	}
	System.out.print(" = "+sum);
	break;
	
	default :
		System.out.print("invalid choice..!!");
 }
}
}