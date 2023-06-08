import java.util.Scanner;
class TableSum2
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number number:   ");
int n = sc.nextInt();
int i=1;
int ans =0,sum=0;   
	while(i<=10)
	{
      ans = n*i;
	  sum =sum+ans;
	 System.out.println(n+" * "+i +" = "+ans);
	 i++;	 
	}
	 System.out.println(sum);
}
}