import java.util.Scanner;

class Fact2
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a num:");
int n = sc.nextInt();
int i, fact;

for(i=1,fact=1; i<=n;fact*=i,i++);
System.out.println(fact);
}
}