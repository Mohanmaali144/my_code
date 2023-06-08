
// markshit Grade ;
import java.util.Scanner;
class Grade
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter mark of physics: ");
int m1 = sc.nextInt();

System.out.println("Enter mark of chemistry: ");
int m2 = sc.nextInt();

System.out.println("Enter mark of maths: ");
int m3 = sc.nextInt();

System.out.println("Enter mark of hindi: ");
int m4 = sc.nextInt();

System.out.println("Enter mark of english: ");
int m5 = sc.nextInt();
float pr = (m1+m2+m3+m4+m5)/5;

if(pr>=90) System.out.println("Grade : A");

if(pr>=80) System.out.println("Grade : B");

if(pr>=70) System.out.println("Grade : C");

if(pr>=60) System.out.println("Grade : D");

if(pr>=40) System.out.println("Grade : E");

if(pr<=40) System.out.println("Grade : F");

}}