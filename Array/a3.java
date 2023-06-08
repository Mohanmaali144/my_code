// java.lang.ArrayIndexOutOfBoundsException:  Error

import java.util.Scanner;
class A3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
			
		int i;
		a[0]=9;
		a[1]=5;
		a[2]=2;
		a[3]=34;
		a[4]=23;
		
		for(i=0; i<8; i++)	
			System.out.println(a[i]);
			
		
		
	}
}	