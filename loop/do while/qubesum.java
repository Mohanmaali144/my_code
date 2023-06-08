// 1  + 8  + 27  + 64  + 125

import java.util.Scanner;
class CubeSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int cube=0,sum=0;   
	do
	{
      cube = i*i*i;	  
	  System.out.print(cube+" ");
		if(i<n)
			System.out.print(" + "); 
		
	   sum=sum+cube;
	   
	   
	 i++;	 
	}while(i<=n);
	
	System.out.print(" = "+ sum); 
			
}
}