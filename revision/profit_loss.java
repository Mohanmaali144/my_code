import java.util.Scanner;
class ProfitLoss
{
public static void main(String[]arg)
{
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter cost prize..");
 double cp = sc.nextDouble();
 
 System.out.println("Enter selling prize..");
 double sp = sc.nextDouble();
 
 
 if(cp==sp)
 {
	 System.out.println("not profit");
 }
 else if(cp>sp)
 {
	 double loss = cp-sp;
	 System.out.println("lose are.. "+loss);
 }
 else if(cp<sp)
 {
	 double profit = sp-cp;
	 System.out.println("Profit are.. "+profit);
 }
 
}
}