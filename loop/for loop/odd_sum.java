import java.util.Scanner;

class OddSum
{
public static void main(String[]arg)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a num");  
  int n = sc.nextInt();
  int i,j=1,sum=0;
  
  for(i=1; i<=n; i++,j=2*i-1)
  {   System.out.print(j+" ");

	if(i<n)
		System.out.print(" + ");
        sum+=j;
     }
	System.out.print(" = "+sum);  
}
}