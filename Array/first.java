// take input size of array and name.... and print there

import java.util.Scanner;
class First
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size= sc.nextInt();
		String name[] = new String[size] ;	
		int i;
		for(i=0; i<size; i++)
		{	 
			System.out.println("Enter Eliment:  "+(i+1));
			name[i]= sc.next();
		}			
		for(i=0; i<size; i++)
		{	 
			System.out.println("\n "+name[i]);
			
		}	
	}
}	