// gross salary
import java.util.Scanner;
class Gross{

public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter salary: ");

float amt = sc.nextFloat();

float pf = (amt*12.5f)/100;
float da = (amt*7.58f)/100;
float ta = (amt*3.6f)/100;

System.out.println("pf = "+pf);
System.out.println("da = "+da);
System.out.println("ta = "+ta);
float gross = da+ta+amt;
System.out.println("Gross salary = "+ gross);
System.out.println("Net salary = "+ (gross-pf));

}
}