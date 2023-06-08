// base area 

import java.util.Scanner;

class Cylinder
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter radius: " );
int radius = sc.nextInt();


float area = 3.14f*(radius*radius);

System.out.print("Base Area of cylinder : "+area);
}
}
