/*Greatest age ____29/04/2023*/
import java.util.Scanner;

class Greatest
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter age of ram :  ");
int ram = sc.nextInt();
System.out.print("Enter age of mohan :  ");
int mohan = sc.nextInt();

System.out.print("Enter age of raj :  ");
int raj = sc.nextInt();

String ans =(ram>mohan&&ram>raj ? "Ram is greater":(mohan>ram&&mohan>raj ?"Mohan is greater" :(raj>ram&&raj>mohan? "raj is Greater":"can it is same")));

System.out.print(ans);
}
}