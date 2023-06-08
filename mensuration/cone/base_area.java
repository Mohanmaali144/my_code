//base Area of cone 

import java.util.Scanner;

class BaseArea
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter redius of cone: " );
float r = sc.nextFloat();

float a = 3.14f *(r*r);

System.out.print("Redius of circle : "+a); 
}
}
