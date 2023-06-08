// Radius of circle

import java.util.Scanner;

class Radius
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter Circumference of circle: " );
float c = sc.nextInt();

float r = c/(2*3.14f);
System.out.print("Redius os circle : "+r);
}
}
